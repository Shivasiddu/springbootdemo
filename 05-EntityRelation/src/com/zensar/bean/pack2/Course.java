package com.zensar.bean.pack2;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "courses10")
public class Course {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int courseId;
	@Column
	String courseName;
	@Column
	double fees;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "c_id")
	Set<Subject> subjects;

	// Constructors
	public Course(String courseName, double fees, Set<Subject> subjects) {
		super();
		this.courseName = courseName;
		this.fees = fees;
		this.subjects = subjects;
	}

	public Course() {
		super();
	}

	// Getters And Setters
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public Set<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}

	// ToString Method
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", fees=" + fees + ", subjects="
				+ subjects + "]";
	}
}