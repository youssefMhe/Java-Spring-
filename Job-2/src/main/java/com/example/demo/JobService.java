package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {
	@Autowired
	private JobRepository jobRepository ;
	
	public Job  addjob( Job job) {
		return  jobRepository.save(job);
	}
	
	public Job  update(int id , Job newJob) {
		if (jobRepository.findById(id).isPresent())
		{
			Job existantjob =jobRepository.findById(id).get();
			existantjob.setEtat(newJob.getEtat());
			existantjob.setService(newJob.getService());
			return  jobRepository.save(existantjob);
		} else 
		return  null;
	}
}
