package com.farmerscheme.farmerscheme.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.farmerscheme.farmerscheme.dao.SchemeDao;
import com.farmerscheme.farmerscheme.entities.Scheme;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/schemes")
public class MyController {
	
	@Autowired
	private SchemeDao schemeDao;
	
	@PostMapping
	public Scheme addScheme(@RequestBody Scheme scheme) {
		return schemeDao.save(scheme);
	}
	
	
	@GetMapping
	public List<Scheme> getSchemes(){
		return schemeDao.findAll();
	}
	
	@GetMapping("/{schemeId}")
	public ResponseEntity<Scheme> getSchemById(@PathVariable Long schemeId){
		Optional<Scheme> optionalScheme = schemeDao.findById(schemeId);
		if(optionalScheme.isPresent()) {
			return ResponseEntity.ok(optionalScheme.get());
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}

}
