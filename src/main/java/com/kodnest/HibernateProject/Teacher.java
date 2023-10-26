package com.kodnest.HibernateProject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher 
{
	
	@Id
    int id;
    String name;
    String subject;
    public Teacher(int id, String name, String subject) {
		super();
		this.id=id;
		this.name=name;
		this.subject=subject;
	}
}

