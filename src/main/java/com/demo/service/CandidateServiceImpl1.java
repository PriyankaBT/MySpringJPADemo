/*
 * package com.demo.service;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.demo.dao.CandidateRepoInterface; import
 * com.demo.entities.Candidate; import com.demo.removeddao.CandidateDao; import
 * com.demo.removeddao.CandidateDaoImpl;
 * 
 * @Service public class CandidateServiceImpl1{ //implements CandidateService {
 * 
 * @Autowired private CandidateDaoImpl cDao;
 * 
 * 
 * 
 * @Override public Candidate getCandidateById(int cid) { Candidate c=
 * cDao.findCandidateById(cid); return c; }
 * 
 * @Override public Candidate saveNewCandidate(Candidate c1) {
 * 
 * return cDao.saveCandidate(c1); }
 * 
 * @Override public int deleteCandidateById(int cid) {
 * 
 * return cDao.deleteCandidateById(cid); }
 * 
 * @Override public Candidate editCandidate(int cid, Candidate c) {
 * 
 * return cDao.editCandidateById(cid, c); }
 * 
 * @Override public List<Candidate> findAllCandidate() {
 * 
 * return cDao.getAllCandidate(); }
 * 
 * }
 */