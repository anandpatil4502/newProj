package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Apoinment;
import com.example.demo.service.ApoinmentService;

@RestController
public class ApinmentController {
	
	@Autowired
	ApoinmentService as;
	@PostMapping("addApoinment")
	String addApoinment(Apoinment a) {
		as.addApoinment(a);
		return "Apoinment booked";
		
	}
	@GetMapping("deleteApoinment/{id}")

		String deleteApoinment(int id){
		
		  as.deleteApoinment(id);
			return "Apoinment deleted";
			
		}
	}


