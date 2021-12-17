package com.demo.removeddao;

import java.util.List;

import com.demo.entities.Candidate;

public interface CandidateDao {
	public Candidate findCandidateById(int cid);
	public Candidate saveCandidate(Candidate c1);
	public int deleteCandidateById(int cid);
	public Candidate editCandidateById(int cid,Candidate c);
	public List<Candidate> getAllCandidate();
}
