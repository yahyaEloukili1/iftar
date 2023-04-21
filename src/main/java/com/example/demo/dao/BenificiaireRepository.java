package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entities.Benificiaire;
import com.example.demo.entities.Categorie;

@CrossOrigin(origins = "*")
public interface BenificiaireRepository extends JpaRepository<Benificiaire, Integer> {

}
