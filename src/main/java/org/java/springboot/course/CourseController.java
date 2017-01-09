package org.java.springboot.course;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topics/{topicId}/courses")
	public List<Course> getAllTopics(@PathVariable String topicId) {
		return courseService.getAllTopics(topicId);
	}
	
	@RequestMapping(method= RequestMethod.GET, value= "/topics/{topicId}/courses/{courseId}")
	public Course getTopics( @PathVariable String courseId){
		return courseService.getTopic(courseId);
	}
	
	@RequestMapping(method=RequestMethod.POST,value= "/topics/{topicId}/courses/")
	public void addNewTopic(@RequestBody Course course ,@PathVariable String topicId){
		courseService.addTopic(course, topicId);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value= "/topics/{topicId}/courses/{courseId}")
	public void updateTopic(@PathVariable  String topicId,@PathVariable String courseId, @RequestBody Course course) {
		courseService.updateTopic(courseId,course,topicId) ;
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value= "/topics/{topicId}/courses/{courseId}")
	public void deleteTopic(@PathVariable String courseId){
		courseService.deleteTopic(courseId);
	}
}
