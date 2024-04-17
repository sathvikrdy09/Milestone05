package com.cherukuClasses.DMS.Respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cherukuClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);
}