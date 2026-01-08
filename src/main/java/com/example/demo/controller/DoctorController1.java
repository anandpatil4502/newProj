package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor1;
import com.example.demo.service.DoctorService1;

@RestController
public class DoctorController1 {

	@Autowired
	DoctorService1 ds;
	
	@PostMapping("addDoctor")
	String addDoctor(@RequestBody Doctor1 d) {
		
		ds.addDoctor(d);
		return "Doctor added";
		
	}
	
	@DeleteMapping("deleteDoctor/{id}")
	String deletDoctor(@PathVariable int id) {
		ds.deletDoctor(id);
		return "Doctor deleted";
		
		
	}
}
