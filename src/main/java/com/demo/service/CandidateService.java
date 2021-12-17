package com.demo.service;

import java.util.List;

import com.demo.entities.Candidate;

public interface CandidateService {
	
	public Candidate getCandidateById(int cid);
	public Candidate saveNewCandidate(Candidate c1);
	public int deleteCandidateById(int cid);
	public Candidate editCandidate(int cid,Candidate c);
	public List<Candidate> findAllCandidate();

}
