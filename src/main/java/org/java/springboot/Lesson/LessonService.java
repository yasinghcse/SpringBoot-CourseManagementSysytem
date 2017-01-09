package org.java.springboot.Lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.java.springboot.course.Course;
import org.java.springboot.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {
	
	@Autowired
	private LessonRepository lessonRepository;
	
	//get all topics
	public List<Lesson> getAllLesson(String topicId){
		List<Lesson> course = new ArrayList<>();
		lessonRepository.findByCourseId(topicId).forEach(course :: add);
		return course;
	}
	
	//get single topics
	public Lesson getLesson(String id){
		return lessonRepository.findOne(id);
	}
	
	//Add new Topics
	public void addLesson(Lesson lesson, String topicId, String courseId){
		System.out.println("Adding Lesson");
		lesson.setCourse(new Course(courseId, "", "", topicId));
		lessonRepository.save(lesson);
	}
	
	//Update 
	public void updateLesson(String topicId, String courseId, String lessId, Lesson lesson){
		lesson.setCourse(new Course(courseId, "", "", topicId));
		lessonRepository.save(lesson);
	}
	
	//delete
	public void deleteLesson(String id){
		lessonRepository.delete(id);
	}
}
