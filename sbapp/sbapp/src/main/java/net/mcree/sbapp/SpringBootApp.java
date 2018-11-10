package net.mcree.sbapp;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import net.mcree.sbapp.entities.SensorReading;
import net.mcree.sbapp.entities.SensorReadingRepository;


@SpringBootApplication
public class SpringBootApp {
	
	@Autowired
	private SensorReadingRepository sensorReadingRepository;
	public static final Logger logger = Logger.getLogger(SpringBootApp.class);
	
	@Bean
	CommandLineRunner runner() {
		return args -> {
			sensorReadingRepository.save(new SensorReading(1L,"98","33","44","53"));
			sensorReadingRepository.save(new SensorReading(2L,"99","34","45","54"));
			sensorReadingRepository.save(new SensorReading(3L,"100","35","46","55"));
			sensorReadingRepository.save(new SensorReading(4L,"97","36","47","56"));
			sensorReadingRepository.save(new SensorReading(5L,"96","37","48","57"));
			List<SensorReading> readings = sensorReadingRepository.findAll();
			for(SensorReading r : readings) {
				logger.info(r.toString());
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApp.class, args);
		logger.info("Hello Spring Boot!");
	}
}
