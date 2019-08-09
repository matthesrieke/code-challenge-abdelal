/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.n52.challenge;

import java.text.DecimalFormat;
import java.text.MessageFormat;

/**
 *
 * @author mohammed
 */
public class Data {

    
    private double rain;
    private double tempreature;
    private double windSpeed;
    private static DecimalFormat df = new DecimalFormat("#0.0#");
    
    public Data(double wind, double rain, double tempreature) {
        this.setWindSpeed(wind);
        this.setRain(rain);
        this.setTempreature(tempreature);
    }
    
    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = Double.parseDouble(df.format(windSpeed));;
    }

    public double getRain() {
        return rain;
    }

    public void setRain(double rain) {
        this.rain = Double.parseDouble(df.format(rain));
    }

    public double getTempreature() {
        return tempreature;
    }

    public void setTempreature(double tempreature) {
        this.tempreature =Double.parseDouble(df.format((tempreature-32.0) / 9.0));
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}°C, {1} wind speed, {2} rain in last three hours",
                this.getTempreature(),this.getWindSpeed(),(this.getRain() == 0)? "no" : this.getRain());
    }
    
  
}
