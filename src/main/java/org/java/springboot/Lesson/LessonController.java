package org.java.springboot.Lesson;

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
public class LessonController {
	
	@Autowired
	private LessonService lessonService;
	
	@RequestMapping("/topics/{topicId}/courses/{courseId}/lessons")
	public List<Lesson> getAllLesson(@PathVariable String courseId) {
		return lessonService.getAllLesson(courseId);
	}
	
	@RequestMapping(method= RequestMethod.GET, value= "/topics/{topicId}/courses/{courseId}/lessons/{lessonId}")
	public Lesson getLesson( @PathVariable String lessonId){
		return lessonService.getLesson(lessonId);
	}
	
	@RequestMapping(method=RequestMethod.POST,value= "/topics/{topicId}/courses/{courseId}/lessons")
	public void addNewLesson(@RequestBody Lesson lesson ,@PathVariable String topicId,@PathVariable String courseId){
		lessonService.addLesson(lesson, topicId,courseId);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value= "/topics/{topicId}/courses/{courseId}/lessons/{lessonId}")
	public void updateLesson(@PathVariable  String topicId,@PathVariable String courseId,@PathVariable  String lessonId,
			@RequestBody Lesson course) {
		lessonService.updateLesson(topicId,courseId,lessonId,course) ;
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value= "/topics/{topicId}/courses/{courseId}/lessons/{lessonID}")
	public void deleteLesson(@PathVariable String lessonID){
		lessonService.deleteLesson(lessonID);
	}
}
