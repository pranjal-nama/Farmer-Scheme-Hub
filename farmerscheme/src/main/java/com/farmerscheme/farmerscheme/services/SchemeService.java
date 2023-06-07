package com.farmerscheme.farmerscheme.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.farmerscheme.farmerscheme.dao.SchemeDao;

import com.farmerscheme.farmerscheme.entities.Scheme;

@Component
public class SchemeService {
	
	@Autowired
	public SchemeDao SchemeDao;
	
	public List<Scheme> getSchemes(){
		List<Scheme> list = (List<Scheme>)this.SchemeDao.findAll();
		return list;
	}

	public Optional<Scheme> getScheme(long schemeId) {
		Optional<Scheme> s = null;
		try {
			s = this.SchemeDao.findById(schemeId);
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return s;
	}
	
	public Scheme addScheme(Scheme scheme) {
		Scheme result = SchemeDao.save(scheme);
		return result;
	}
}
