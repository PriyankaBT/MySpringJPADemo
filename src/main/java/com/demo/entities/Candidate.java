package com.demo.entities;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Candidate_Details")
public class Candidate {//implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	@Column(name="cfirstname")
	private String firstname;
	@Column(name="clastname")
	private String lastname;
	@Column(name="cskills")
	private String[] skills;
	@Column(name="cexpr")
	private double experience;
	
	public Candidate() {}
	public Candidate(int cid, String firstname, String lastname, String[] skills, double experience) {
		super();
		this.cid = cid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.skills = skills;
		this.experience = experience;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	public double getExperience() {
		return experience;
	}
	public void setExperience(double experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Candidate [cid=" + cid + ", firstname=" + firstname + ", lastname=" + lastname + ", skills="
				+ Arrays.toString(skills) + ", experience=" + experience + "]";
	}
	
	
}
