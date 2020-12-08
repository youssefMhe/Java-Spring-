package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController@RequestMapping(value="/api/job")

public class JobRestAPI {
private String title ="Bonjour , je suis le Job  microservices  :) " ;
	
	@Autowired
	private JobService JobServices ;
	
	@RequestMapping("/hello")
	public String Sayhello() {
		System.out.print(title);
		return title;

	}
	
	@PostMapping 
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Job> createCondidat(@RequestBody Job job ){
		
		return new ResponseEntity<> (JobServices.addjob(job),HttpStatus.OK);
	}
	
	@PutMapping (value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Job> updateCondidat(@PathVariable(value="id") int id ,@RequestBody Job job ){
		
		return new ResponseEntity<> (JobServices.update(id , job),HttpStatus.OK);
	}
}
