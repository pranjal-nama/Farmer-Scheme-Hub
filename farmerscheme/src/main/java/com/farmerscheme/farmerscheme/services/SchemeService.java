package com.farmerscheme.farmerscheme.services;

import java.util.List; 

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

	public Scheme getScheme(long schemeId) {
		Scheme s = null;
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
