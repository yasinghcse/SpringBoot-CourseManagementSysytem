package org.java.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		//		ArrayList<Topic> arr = new ArrayList<Topic>();
		//		Topic t = new Topic("1", "name1", "Desc1");
		//		Topic t1 = new Topic("2", "name2", "Desc2");
		//		Topic t2 = new Topic("3", "name3", "Desc3");
		//		arr.add(t);
		//		arr.add(t1);
		//		arr.add(t2);
		//		return arr;
		return Arrays.asList(
				new Topic("1", "name1", "Desc1"),
				new Topic("2", "name2", "Desc2"),
				new Topic("3", "name3", "Desc3")
				);
	}
}
