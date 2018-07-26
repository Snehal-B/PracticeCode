package com.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	List<Topic> topics = new ArrayList<Topic>(Arrays.asList(new Topic("1", "Snehal", "Java Developer"),
			new Topic("2", "Amol", "Scrum Master"), new Topic("3", "Amol W", "Full Stack ")));

	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopicById(String id){
		return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id,Topic topic) {
		for(int i=0;i<topics.size();i++){
			Topic t=topics.get(i);
			if(t.getId().equals(id)){
				topics.set(i, topic);
			}
			return;
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(t-> t.getId().equals(id));
	}
	
}
