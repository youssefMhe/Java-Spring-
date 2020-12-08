package com.example.demo;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class Job1Application {

	public static void main(String[] args) {
		SpringApplication.run(Job1Application.class, args);
	}
	@Bean
	 ApplicationRunner init ( JobRepository repository )
	 {
		return args->{
			             Stream.of("Sante","Mecanique","Web").forEach(service->{ repository.save(new Job (service));  });
		
		repository.findAll().forEach(System.out::println); };
	 };

}
