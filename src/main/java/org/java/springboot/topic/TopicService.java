package org.java.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<Topic>(
			Arrays.asList(
					new Topic("1", "name1", "Desc1"),
					new Topic("2", "name2", "Desc2"),
					new Topic("3", "name3", "Desc3")
					)
			);
	
	//get all topics
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	//get single topics
	public Topic getTopic(String id){
		
		//Using Lambda Expressions
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
		//Regular Use
		//		for(int i=0; i < topics.size(); i++){
		//			Topic t = topics.get(i);
		//			if(t.getId().equals(id)){
		//				return t;
		//			}
		//		}
		//		return null;
	}
	
	
	//Add new Topics
	public void addTopic(Topic topic){
		topics.add(topic);
	}
	
	//Update 
	public void updateTopic(String id, Topic topic){
		for(int i=0; i < topics.size();i++){
			Topic t = topics.get(i);
			if(t.getId().equals(topic.getId())){
				topics.set(i, topic);
				System.out.println("Updated Successfully");
				return;
			}
		}
	}
	
	//delete
	public void deleteTopic(String id){
		//		for(int i=0; i < topics.size();i++){
		//			Topic t = topics.get(i);
		//			if(t.getId().equals(id)){
		//				topics.remove(i);
		//				System.out.println("Deleted Successfully");
		//				return;
		//			}
		//		}
		
		//lambda expressions
		topics.removeIf(t->t.getId().equals(id));
	}
}
