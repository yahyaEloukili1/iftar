package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Categorie;
import com.example.demo.entities.District;

public interface CategorieRepository extends JpaRepository<Categorie, Integer> {

}
