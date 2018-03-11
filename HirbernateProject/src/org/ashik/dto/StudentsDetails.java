package org.ashik.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="STUDENTS")
public class StudentsDetails {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="STUDENT_ID")
	private int id;
	@Column(name="STUDENT_NAME")
	private String name;
	@ManyToMany
	private Collection<SubjectDetails> subjects = new ArrayList<SubjectDetails>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Collection<SubjectDetails> getSubjects() {
		return subjects;
	}
	public void setSubjects(Collection<SubjectDetails> subjects) {
		this.subjects = subjects;
	}
	
	
}
