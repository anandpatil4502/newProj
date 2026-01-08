package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Apoinment {
	@Id
	private int id;
	private String pName;
	private String drName;
	private int age;
	public synchronized int getId() {
		return id;
	}
	public synchronized void setId(int id) {
		this.id = id;
	}
	public synchronized String getpName() {
		return pName;
	}
	public synchronized void setpName(String pName) {
		this.pName = pName;
	}
	public synchronized String getDrName() {
		return drName;
	}
	public synchronized void setDrName(String drName) {
		this.drName = drName;
	}
	public synchronized int getAge() {
		return age;
	}
	public synchronized void setAge(int age) {
		this.age = age;
	}
	

}
