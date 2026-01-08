package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Apoinment;

public interface ApoinmentReposetory extends JpaRepository<Apoinment, Integer>{

}
