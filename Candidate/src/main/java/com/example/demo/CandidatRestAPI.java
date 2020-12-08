package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
@RequestMapping(value="/api/candidat")
public class CandidatRestAPI {
	private String title ="Bonjour , je suis le condidtate microservices" ;
	
	@Autowired
	private CandidatService candidatService ;
	
	@RequestMapping("/hello")
	public String Sayhello() {
		System.out.print(title);
		return title;

	}
	
	@PostMapping 
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Candidat> createCondidat(@RequestBody Candidat candidat ){
		
		return new ResponseEntity<> (candidatService.addcondidat(candidat),HttpStatus.OK);
	}
	
	@PutMapping (value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Candidat> updateCondidat(@PathVariable(value="id") int id ,@RequestBody Candidat candidat ){
		
		return new ResponseEntity<> (candidatService.update(id , candidat),HttpStatus.OK);
	}
	
	@DeleteMapping(value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteCondidat(@PathVariable(value="id") int id ){
		
		return new ResponseEntity<> (candidatService.deletecandidat(id),HttpStatus.OK);
	}
	
	
	
}
