package com.example.demo;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
@EnableDiscoveryClient

public class CandidateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CandidateApplication.class, args);
	}

@Bean
 ApplicationRunner init ( CandidatRepository repository )
 {
	return args->{
		             Stream.of("Mareim","Sarra","Mohamed").forEach(nom->{ repository.save(new Candidat (nom));  });
	
	repository.findAll().forEach(System.out::println); };
 };

}
