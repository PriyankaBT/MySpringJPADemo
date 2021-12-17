package com.demo.removeddao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.demo.entities.Candidate;

@Repository
public class CandidateDaoImpl implements CandidateDao{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Candidate findCandidateById(int cid) {
		Candidate c = em.find(Candidate.class, cid);
		return c;
	}

	@Override
	public Candidate saveCandidate(Candidate c1) {
		em.getTransaction().begin();
		em.persist(c1);
		em.getTransaction().commit();
		return c1;
	}

	@Override
	@Transactional
	public int deleteCandidateById(int cid) {
		int res = 0;

		Candidate c = findCandidateById(cid);
		if(c!=null) {
		em.remove(c);
		res=1;
		}
		return res;
	}

	@Override
	@Transactional
	public Candidate editCandidateById(int cid, Candidate c) {
		Candidate obj = findCandidateById(cid);
		if(obj!=null) {
		obj=em.merge(c);
		}
		return obj;
	}

	@Override
	public List<Candidate> getAllCandidate() {
		TypedQuery<Candidate> q1= em.createQuery("Select obj From Candidate obj", Candidate.class);
		List<Candidate> clist = q1.getResultList();
				
		return clist;
	}

}
