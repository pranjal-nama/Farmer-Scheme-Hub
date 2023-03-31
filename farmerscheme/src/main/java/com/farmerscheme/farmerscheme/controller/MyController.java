package com.farmerscheme.farmerscheme.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.farmerscheme.farmerscheme.entities.Scheme;
import com.farmerscheme.farmerscheme.services.SchemeService;


@RestController
public class MyController {
	
	@Autowired
	private SchemeService schemeService;
	
	//Get the schemes
	@GetMapping("/schemes")
	public List<Scheme> getSchemes(){
		return this.schemeService.getSchemes();
	}
	
	@GetMapping("/schemes/{schemeId}")
	public Scheme getScheme(@PathVariable String schemeId) {
		return this.schemeService.getScheme(Long.parseLong(schemeId)); 
	}
	
	@PostMapping("/schemes")
	public Scheme addScheme(@RequestBody Scheme scheme) {
		return this.schemeService.addScheme(scheme);
	}

}
