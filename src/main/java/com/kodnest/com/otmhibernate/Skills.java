package com.kodnest.com.otmhibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Skills {

	@Id
	int skill_id;
	String skill_name;
	@ManyToOne
	Student st;

	public Skills(int skill_id, String skill_name, Student st) {
		super();
		this.skill_id = skill_id;
		this.skill_name = skill_name;
		this.st = st;
	}

	public Skills() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setSkill_id(int skill_id) {
		this.skill_id = skill_id;
	}

	public void setSkill_name(String skill_name) {
		this.skill_name = skill_name;
	}

	public void setSt(Student st) {
		this.st = st;
	}
	
	
}
