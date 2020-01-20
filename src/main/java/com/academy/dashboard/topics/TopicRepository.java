package com.academy.dashboard.topics;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>{

	public Topic findByTitle(String title);
	
	//getTopics
	//getTopic(id)
	//deleteTopic
	//updateTopic
	//createTopic
	
}
