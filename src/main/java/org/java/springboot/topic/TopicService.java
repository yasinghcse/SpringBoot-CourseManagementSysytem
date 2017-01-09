package org.java.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	//get all topics
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics :: add);
		return topics;
	}
	
	//get single topics
	public Topic getTopic(String id){
		
		return topicRepository.findOne(id);
		//Using Lambda Expressions
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
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
		topicRepository.save(topic);
		//topics.add(topic);
	}
	
	//Update 
	public void updateTopic(String id, Topic topic){
		topicRepository.save(topic);
		//		for(int i=0; i < topics.size();i++){
		//			Topic t = topics.get(i);
		//			if(t.getId().equals(topic.getId())){
		//				topics.set(i, topic);
		//				System.out.println("Updated Successfully");
		//				return;
		//			}
		//		}
	}
	
	//delete
	public void deleteTopic(String id){
		
		topicRepository.delete(id);
		//		for(int i=0; i < topics.size();i++){
		//			Topic t = topics.get(i);
		//			if(t.getId().equals(id)){
		//				topics.remove(i);
		//				System.out.println("Deleted Successfully");
		//				return;
		//			}
		//		}
		
		//lambda expressions
		//topics.removeIf(t->t.getId().equals(id));
	}
}
