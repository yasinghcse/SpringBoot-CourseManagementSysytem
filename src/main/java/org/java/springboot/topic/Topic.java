package org.java.springboot.topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.java.springboot.course.Course;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Topic {
	
	@Id
	private String id;
	private String name;
	private String description;
	
	public Topic(){
		
	}
	public Topic(String id, String name, String description){
		this.id= id;
		this.name= name;
		this.description= description;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
