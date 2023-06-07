package com.farmerscheme.farmerscheme.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.farmerscheme.farmerscheme.entities.Scheme;


@Repository
public interface SchemeDao extends JpaRepository<Scheme, Long> {
	
}
