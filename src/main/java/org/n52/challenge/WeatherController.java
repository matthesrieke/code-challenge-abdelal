/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.n52.challenge;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.aksingh.owmjapis.api.APIException;
import net.aksingh.owmjapis.core.OWM;
import net.aksingh.owmjapis.model.CurrentWeather;

/**
 *
 * @author mohammed
 */
public class WeatherController {
   
    public CityWeather retrieveWeather(String cityName) throws APIException {

        CityWeather cityWeather = new CityWeather();
        double wind, temprature, rain;
        Data data = new Data(0, 0, 0);

        // declaring object of "OWM" class
        OWM owm = new OWM("x");

        // getting current weather data for the "Muenster" city
        CurrentWeather cwd = owm.currentWeatherByCityName(cityName);

        //printing city name from the retrieved data
        String city = cwd.getCityName();
        // printing  temperature
        if (cwd.getMainData() != null) {
            temprature = (cwd.getMainData().getTemp() == null) ? 0.0 : cwd.getMainData().getTemp();
            data.setTempreature(temprature);
        }
        // getting the wind data
        if (cwd.getWindData() != null) {
            wind = (cwd.getWindData().getSpeed() == null) ? 0.0 : cwd.getWindData().getSpeed();
            data.setWindSpeed(wind);
        }
        // getting the rain data
        if (cwd.getRainData() != null) {
            rain = (cwd.getRainData().getPrecipVol3h() == null) ? 0.0 : cwd.getRainData().getPrecipVol3h();
            data.setRain(rain);
        }
        // assinging the data ,city and the time tó the object cityWeather 
        cityWeather.setData(data);
        cityWeather.setCity(city);
        cityWeather.setTime(new Date());
        return cityWeather;
    }

    public String deseralize(Object o) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        DateFormat df = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");
        objectMapper.setDateFormat(df);
        return objectMapper.writeValueAsString(o);
    }
}
