package com.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.CandidateRepoInterface;
import com.demo.entities.Candidate;
import com.demo.removeddao.CandidateDao;
import com.demo.removeddao.CandidateDaoImpl;

@Service
public class CandidateServiceImpl implements CandidateService {

	@Autowired
	CandidateRepoInterface repo;

	
	
	@Override
	public Candidate getCandidateById(int cid) {
		Candidate c= repo.getById(cid);
		
		return c;
	}

	@Override
	@Transactional
	public Candidate saveNewCandidate(Candidate c1) {
		
		return repo.save(c1);
	}

	@Override
	@Transactional
	public int deleteCandidateById(int cid) {
		int n=1;
		repo.deleteById(cid);
		if(repo.existsById(cid)) {
			n=0;
		}
		return n;
	}

	@Override
	@Transactional
	public Candidate editCandidate(int cid, Candidate c) {
	
		return repo.save(c);
	}

	@Override
	public List<Candidate> findAllCandidate() {
		
		return repo.findAll();
	}

}
