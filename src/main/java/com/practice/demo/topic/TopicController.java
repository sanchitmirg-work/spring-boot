package com.practice.demo.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("spring", "Spring Framework", "Spring Framework Description"),
				new Topic("spring 1", "Spring Framework 1", "Spring Framework Description 1"),
				new Topic("spring 2", "Spring Framework 2", "Spring Framework Description 2")
				);
	}
}
