package net.mcree.sbapp.entities;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * A simple custom interface that allows us to extend the CrudRepository
 * interface and set our own parameters SensorReading and Long.  This enables
 * us to use methods from CrudRepository to save an Entity (SensorReading)
 * to a database.
 * @author mam02
 *
 */

public interface SensorReadingRepository extends CrudRepository<SensorReading, Long> {
	
	List<SensorReading> findAll();

}
