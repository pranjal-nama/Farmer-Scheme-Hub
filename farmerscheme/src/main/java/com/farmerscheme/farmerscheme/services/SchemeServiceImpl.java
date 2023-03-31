package com.farmerscheme.farmerscheme.services;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.farmerscheme.farmerscheme.entities.Scheme;


@Service
public class SchemeServiceImpl implements SchemeService {

	List<Scheme> list;
	
	public SchemeServiceImpl() {
		list = new ArrayList<>();
		list.add(new Scheme(1, "Pradhan Mantri Kisan Samman Nidhi", 
				"Pradhan Mantri Kisan Samman Nidhi (PM-KISAN) is a new Central Sector Scheme to provide income support to "
				+ "all landholding farmers' families in the country to supplement their financial needs for procuring "
				+ "various inputs related to agriculture and allied activities as well as domestic needs.", "1. All land "
						+ "holding eligible farmer families"));
		list.add(new Scheme(2, "Paramparagat Krishi Vikas Yojana", "This scheme promotes organic farming practices and "
				+ "provides financial assistance to farmers for the adoption of organic farming techniques.", "1. The scheme "
						+ "is open to all farmers, whether they own or lease land."
						+ "2. The farmer should have a minimum of 0.6 hectares (1.5 acres) of agricultural land."
						+ "3. Farmers who are already practicing organic farming are also eligible for the scheme."));
	}
	
	@Override
	public List<Scheme> getSchemes() {
		return list;
	}

	@Override
	public Scheme getScheme(long schemeId) {
		Scheme s = null;
		for(Scheme scheme:list) {
			if(scheme.getId()==schemeId) {
				s = scheme;
				break;
			}
		}
		return s;
	}

	@Override
	public Scheme addScheme(Scheme scheme) {
		list.add(scheme);
		return scheme;
	}

}
