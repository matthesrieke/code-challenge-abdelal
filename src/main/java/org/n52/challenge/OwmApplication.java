package org.n52.challenge;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.logging.Level;
import net.aksingh.owmjapis.api.APIException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Matthes Rieke <m.rieke@52north.org>
 */
public class OwmApplication {

    private static final Logger LOG = LoggerFactory.getLogger(OwmApplication.class);

    public static void main(String[] args){

        try {
            
            WeatherController controller = new WeatherController();
            CityWeather city = controller.retrieveWeather("Muenster");
            LOG.info("Current weather in Münster:{}", city.getData());
            LOG.info("Weather as JSON:\n {}", controller.deseralize(city));
            
        } catch (APIException | JsonProcessingException ex) {
            java.util.logging.Logger.getLogger(OwmApplication.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
}
