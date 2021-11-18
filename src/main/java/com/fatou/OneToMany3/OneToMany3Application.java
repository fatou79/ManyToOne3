package com.fatou.OneToMany3;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fatou.OneToMany3.entity.CourseRepository;
import com.fatou.OneToMany3.entity.Review;

@SpringBootApplication
public class OneToMany3Application  implements CommandLineRunner{
	
	private Logger bintou = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseRepository cr;

	public static void main(String[] args) {
		SpringApplication.run(OneToMany3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Review> reviews = new ArrayList<>(List.of(new Review("4","very nice"),new Review("5", "Very beautiful"),
				new Review("7", "Excellent")));
		
		
		cr.addReviewsforCourses(10001L, reviews);
		
	}

}
