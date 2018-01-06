package com.jpa_boot.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.jpa_boot.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
	
	Optional<Category> findByDescription(String description);
}
