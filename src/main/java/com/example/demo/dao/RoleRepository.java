package com.example.demo.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entities.AppRole;







@CrossOrigin(origins = "*")
public interface RoleRepository extends JpaRepository<AppRole, Integer> {

	public AppRole findByRoleName(String roleName);
}
