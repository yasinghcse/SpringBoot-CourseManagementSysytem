package org.java.springboot.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.java.springboot.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	//get all topics
	public List<Course> getAllTopics(String topicId){
		List<Course> course = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(course :: add);
		return course;
	}
	
	//get single topics
	public Course getTopic(String id){
		return courseRepository.findOne(id);
	}
	
	//Add new Topics
	public void addTopic(Course course, String topicId){
		course.setTopic(new Topic(topicId, "", ""));
		courseRepository.save(course);
	}
	
	//Update 
	public void updateTopic(String id, Course course, String topicId){
		course.setTopic(new Topic(topicId, "", ""));
		courseRepository.save(course);
	}
	
	//delete
	public void deleteTopic(String id){
		courseRepository.delete(id);
	}
}
