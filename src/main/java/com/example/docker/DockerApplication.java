package com.example.docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerApplication {

	
//	@Autowired
//	private MovieRepository mRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
	}
	
//	public void run(String... args) throws Exception{
//		
//		mRepo.save(new Movie("Bahubali"));
//		
//		mRepo.save(new Movie("Sura"));
//		
//		mRepo.save(new Movie("Sarkar"));
//		
//		mRepo.save(new Movie("Thalaiva"));
//		
//		mRepo.save(new Movie("Singam"));
//		
//		
//	}

}
