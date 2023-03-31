package com.farmerscheme.farmerscheme.services;

import java.util.List;

import com.farmerscheme.farmerscheme.entities.Scheme;

public interface SchemeService {
	
	public List<Scheme> getSchemes();

	public Scheme getScheme(long schemeId);
	
	public Scheme addScheme(Scheme scheme);
}
