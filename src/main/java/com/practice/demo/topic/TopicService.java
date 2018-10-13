package com.practice.demo.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("spring 1", "Spring Framework 1", "Spring Framework Description 1"),
			new Topic("spring 2", "Spring Framework 2", "Spring Framework Description 2")
			);
	
	public List<Topic> getAllTopics() {
		return topics;
	}
}
