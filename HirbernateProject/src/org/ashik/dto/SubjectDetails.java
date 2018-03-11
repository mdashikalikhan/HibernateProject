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

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="SUBJECTS")
public class SubjectDetails {
	/*@Id @GeneratedValue(generator="uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	@Column(name="SUBJECT_ID")
	private String id;*/
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="SUBJECT_NAME")
	private String name;
	@ManyToMany (mappedBy="subjects")
	private Collection<StudentsDetails> students = new ArrayList<StudentsDetails>();
	
	
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
	public Collection<StudentsDetails> getStudents() {
		return students;
	}
	public void setStudents(Collection<StudentsDetails> students) {
		this.students = students;
	}
	
	

}
