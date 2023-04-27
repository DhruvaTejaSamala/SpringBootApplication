package com.SampleProjectClasses.DMS.Repository;

/**
 * @author Dhruva teja Samala - S555345
 *
 * Spring Boot Project Milestone
 */

import org.springframework.data.repository.CrudRepository;

import com.SampleProjectClasses.DMS.Models.Dog;

import java.util.*;


public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);
}