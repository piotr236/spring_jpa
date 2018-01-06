package com.jpa_boot.repo;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.jpa_boot.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
	Optional<UnitOfMeasure> findByDescrpiton(String description);
	
}
