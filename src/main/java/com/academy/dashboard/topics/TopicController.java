package com.academy.dashboard.topics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public String getTopics(Model model){
		
		model.addAttribute("topics",topicService.getTopics());
		return "topics";
	}
	
	@RequestMapping("/addTopic")
	public String addTopic(Model model){
		
		return "addTopic";
	}
	
	@RequestMapping("/topics/{id}")
	public String getTopic(@PathVariable String id, Model model) {
		topicService.getTopic(id).ifPresent(topic ->  model.addAttribute("topic",topic));
		return "topic";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public String addTopic( Topic topic, Model model) {
		topicService.addTopic(topic);
		model.addAttribute("topics",topicService.getTopics());
		return "topics";
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void editTopic(@RequestBody Topic topic, @PathVariable String id) {
		
		topicService.editTopic(topic, id);
		
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		 topicService.deleteTopic(id);
	}
	
	

}
