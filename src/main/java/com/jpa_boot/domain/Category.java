package com.jpa_boot.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;



@Entity
public class Category {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String description;

	@ManyToMany
	@JoinTable(name = "recipeee_category",
	joinColumns = @JoinColumn(name ="category_id"),
	inverseJoinColumns = @JoinColumn(name = "recipe_id"))
	private Set<Recipe> recipes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Recipe> getRecipes() {
		return recipes;
	}

	public void setRecipes(Set<Recipe> recipes) {
		this.recipes = recipes;
	}
	
	
	
	
}
