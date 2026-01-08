package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Apoinment;
import com.example.demo.repo.ApoinmentReposetory;

@Service
public class ApoinmentServicImpl implements ApoinmentService {
	@Autowired
	ApoinmentReposetory ar;

	@Override
	public void addApoinment(Apoinment a) {
		// TODO Auto-generated method stub
		ar.save(a);
	}

	@Override
	public void deleteApoinment(int id) {
		// TODO Auto-generated method stub
		ar.deleteById(id);
	}

}
