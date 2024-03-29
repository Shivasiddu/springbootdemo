package com.zensar.bean;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employee {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	@Column
	private String name;
	@Column
	private LocalDate dateOfJoin;
	@Column
	private double basic;
	@Column
	private char grade;

	// Getter and Setters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(LocalDate dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	// ToString Method
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", dateOfJoin=" + dateOfJoin + ", basic=" + basic
				+ ", grade=" + grade + "]";
	}
}