package com.academy.dashboard.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("1", "Array","Easy"),
			new Topic("2", "Maths","Easy"),
			new Topic("3", "Sorting","Easy"),
			new Topic("4", "Searching","Hard")));
	
	
	public List<Topic> getTopics(){
		return topics;
	}


	public Topic getTopic(String id) {
		for(Topic topic:topics) {
			if (topic.getId().equals(id)) {
				return topic;
			}
		}
		return null;
	}


	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}
	
	

}
