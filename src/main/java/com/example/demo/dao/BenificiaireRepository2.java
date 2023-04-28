package com.example.demo.dao;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entities.Benificiaire;
import com.example.demo.entities.Benificiaire2;
import com.example.demo.entities.Categorie;
import com.example.demo.projections.AnnexeProjection;
import com.example.demo.projections.BenificiaireProjection;

@CrossOrigin(origins = "*")
@RepositoryRestResource(excerptProjection = BenificiaireProjection.class)
public interface BenificiaireRepository2 extends JpaRepository<Benificiaire2, Integer> {

	@Query("SELECT b.cin, b FROM Benificiaire b")
	List<Object[]> findByCinGrouped();




}
