package com.kodnest.com.otmhibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
 
	@Id
	int s_id;
	String s_name;
	@OneToMany
	List<Skills> sk;

	public Student() {
		
	}

	public Student(int s_id, String s_name, List<Skills> sk) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.sk = sk;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public void setSk(List<Skills> sk) {
		this.sk = sk;
	}

	
}
