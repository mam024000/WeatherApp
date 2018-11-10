package net.mcree.sbapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Represents a single reading from a weather sensor.  Each
 * object is an instance of a reading, or, a row in a table
 * or database.
 * @author mam02
 *
 */

@Entity
public class SensorReading {
	
	//TODO: Add date and time to each reading.
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String temperature;
	private String humidity;
	private String dewPoint;
	private String light;
	
	public SensorReading() {
		
		this.id = 0L;
		this.temperature = "No reading..";
		this.humidity = "No reading..";
		this.dewPoint = "No reading..";
		this.light = "No reading..";
	}

	public SensorReading(Long id, String temperature, String humidity, String dewPoint, String light) {
		super();
		this.id = id;
		this.temperature = temperature;
		this.humidity = humidity;
		this.dewPoint = dewPoint;
		this.light = light;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	public String getDewPoint() {
		return dewPoint;
	}

	public void setDewPoint(String dewPoint) {
		this.dewPoint = dewPoint;
	}

	public String getLight() {
		return light;
	}

	public void setLight(String light) {
		this.light = light;
	}
	
	public String toString() {
		return new String("Temperature: " + this.getTemperature() + "|" +
						  "Humidity: " + this.getHumidity() + "|" +
						  "Dewpoint: " + this.getDewPoint() +  "|" +
						  "Light: " + this.getLight());
	}

}
