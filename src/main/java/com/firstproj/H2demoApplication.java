package com.firstproj;

import com.firstproj.domain.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.firstproj.repository.PostRepository;

import javax.annotation.PostConstruct;


@SpringBootApplication
@EnableAutoConfiguration
public class H2demoApplication {

	private static final Logger logger = LoggerFactory.getLogger(H2demoApplication.class);

	//postRepository
	@Autowired
	PostRepository postRepository;


	public static void main(String[] args) {
		SpringApplication.run(H2demoApplication.class, args);
	}

	@PostConstruct
	void seePosts() {
		logger.info("seeposts method called...");
		for(Post post: postRepository.findAll()){
			logger.info(post.toString());
		}
	}
}
