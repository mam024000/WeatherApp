package net.mcree.sbapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.mcree.sbapp.SpringBootApp;
import net.mcree.sbapp.EndSystemUris;

/**
 * The EndSystemController is the gateway to all services provided
 * by this application. Whether data is being posted from the 
 * sensor(s) or being requested from a user, the controller receives
 * and routes the request to the appropriate service.  The service 
 * returns a response to the controller which returns a response
 * to the user when appropriate.
 * @author mam02
 *
 */

@RestController
public class EndSystemController {
	
	@RequestMapping(EndSystemUris.TEMPERATURE)
	public String getCurrentTemperature() {
		
		SpringBootApp.logger.info("Temperature: ");
		//TODO: Will be replaced with a call to the service to get the current temperature reading.
		return new String("Current temperature.");
	}
	
	@RequestMapping(EndSystemUris.HUMIDITY)
	public String getCurrentHumidity() {
		
		SpringBootApp.logger.info("Humidity: ");
		//TODO: Will be replaced with a call to the service to get the current humidity reading.
		return new String("Current humidity.");
	}
	
	@RequestMapping(EndSystemUris.DEWPOINT)
	public String getCurrentDewpoint() {
		
		SpringBootApp.logger.info("Dewpoint: ");
		//TODO: Will be replaced with a call to the service to get the current dewpoint reading.
		return new String("Current dewpoint.");
	}
	
	@RequestMapping(EndSystemUris.LIGHT)
	public String getCurrentLight() {
		
		SpringBootApp.logger.info("Light: ");
		//TODO: Will be replaced with a call to the service to get the current light reading.
		return new String("Current light.");
	}
	
	@RequestMapping(EndSystemUris.ALL)
	public String getAllReadings() {
		
		SpringBootApp.logger.info("All readings... ");
		//TODO: Will be replaced with a call to the service to get all readings for current day.
		return new String("All readings.");
	}
}
