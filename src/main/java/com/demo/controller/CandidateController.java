package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.demo.entities.*;
import com.demo.service.CandidateService;
import com.demo.service.CandidateServiceImpl;

@RestController
@RequestMapping("/api")
public class CandidateController {
	@Autowired
	private CandidateServiceImpl candidateService;
	
	@PostMapping("/candidate/add")
	public ResponseEntity<Candidate> addCandidate(@RequestBody Candidate c1){
		Candidate c2 =candidateService.saveNewCandidate(c1);
		if(c2==null)
		{
			return new ResponseEntity("Sorry! Candidate not available!", 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Candidate>(c2, HttpStatus.OK);
		
	}

	@GetMapping(value = "/candidate/{canid}",  produces = { MediaType.APPLICATION_JSON_VALUE })
		public ResponseEntity<Candidate> getCandidateforId(@PathVariable("canid") Integer cid){
		Candidate c1 =candidateService.getCandidateById(cid);
		if(c1==null)
		{
			return new ResponseEntity("Sorry! Candidate not available!", 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Candidate>(c1, HttpStatus.OK);
		
	}
	
	@GetMapping(value="/candidate",  produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<Candidate>> getCandidateList(){
		List<Candidate> clist =candidateService.findAllCandidate();
		if(clist.isEmpty())
		{
			return new ResponseEntity("Sorry! Candidate not available!", 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<Candidate>>(clist, HttpStatus.OK);
		
	}
	
	@PutMapping(value="/candidate/edit/{id}",consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Candidate> updateCandidatet(@PathVariable("id") Integer cid,
			@RequestBody Candidate c){
		Candidate c1 =candidateService.editCandidate(cid, c);
		if(c1==null)
		{
			return new ResponseEntity("Sorry! Candidate not available!", 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Candidate>(c1, HttpStatus.OK);
		
	}
	
	@DeleteMapping(value = "/candidate/del/{canid}")
	public ResponseEntity<String> deleteCandidateforId(@PathVariable("canid") Integer cid){
	int n =candidateService.deleteCandidateById(cid);
	if(n==0)
	{
		return new ResponseEntity("Sorry! Candidate not be deleted!", 
				HttpStatus.NOT_FOUND);
	}
	
	return new ResponseEntity<String>("Candidate deleted", HttpStatus.OK);
	
}
	
}
