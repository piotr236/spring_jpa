package com.jpa_boot.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.jpa_boot.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
	Optional<Recipe> findByDescription(String description);
}
