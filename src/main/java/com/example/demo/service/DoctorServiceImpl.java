package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor1;
import com.example.demo.repo.DoctorReposetory1;
@Service
public class DoctorServiceImpl implements DoctorService1{
   @Autowired
	DoctorReposetory1 ds;
	
   @Override
	public void addDoctor(Doctor1 d) {

	   ds.save(d);
	   
	}@Override
		public void deletDoctor(int id) {
			// TODO Auto-generated method stub
			ds.deleteById(id);
		}
		
	}
