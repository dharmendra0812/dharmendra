package com.springbootdemo.springbootdemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springbootdemo.springbootdemo.model.Topic;

@Service
public class TopicService {
	
	private List<Topic> list = new ArrayList<Topic>(Arrays.asList(
			new Topic("Spring","Spring Framework", "Spring Framework Description"),
			new Topic("Hibernate","Hibernate Framework", "HibernateFramework Description"),
			new Topic("javascript","javascript Framework", "javascript Framework Description")
			));
	

	public List<Topic> getAllTopics(){
			return list;
	}
	
	public Topic  getTopic(String id){
		return list.stream().filter(i-> id.equals(i.getId())).findFirst().get(); 
	}
	
	
	public void addTopic(Topic topic) {
		list.add(topic);
	}
	
	public void updateTopic(Topic topic, String id) {
		
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).getId().equals(id)) {
				list.set(i, topic);
			}
		}
	}

	public void delete(String id) {
		list.removeIf(i -> id.equals(i.getId()));
		
	}

}
