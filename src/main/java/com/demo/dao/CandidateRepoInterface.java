package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.Candidate;

@Repository
public interface CandidateRepoInterface extends JpaRepository<Candidate,Integer> {

}
