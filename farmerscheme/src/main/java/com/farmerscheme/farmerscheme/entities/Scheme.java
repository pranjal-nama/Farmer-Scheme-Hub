package com.farmerscheme.farmerscheme.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "schemes")
public class Scheme {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String description;
	private String eligibilityCriteria;
	public Scheme(long id, String title, String description, String eligibilityCriteria) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.eligibilityCriteria = eligibilityCriteria;
	}
	
	public Scheme() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEligibilityCriteria() {
		return eligibilityCriteria;
	}

	public void setEligibilityCriteria(String eligibilityCriteria) {
		this.eligibilityCriteria = eligibilityCriteria;
	}

	@Override
	public String toString() {
		return "Scheme [id=" + id + ", title=" + title + ", description=" + description + ", eligibilityCriteria="
				+ eligibilityCriteria + "]";
	}
	
	
}
