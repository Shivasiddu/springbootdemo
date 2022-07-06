package com.zensar.springbootdemo.service;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;

import com.zensar.springbootdemo.dto.StudentDto;

public interface StudentService {
	public StudentDto getStudent(int studentId);

	public List<StudentDto> getStudents(int pageNumber, int pageSize, String sortBy, Direction dir);

	public StudentDto insertStudent(StudentDto studentdto);

	public void deleteStudent(int studentId);

	public StudentDto updateStudent(int studentId, StudentDto studentDto);

	public List<StudentDto> getByStudentName(String studentName);

	public List<StudentDto> getByStudentNameAndStudentAge(String studentName, int age);

	public List<StudentDto> getByStudentNameOrStudentAge(String studentName, int age);

	public List<StudentDto> getByStudentNameEndsWith(String suffix);

	public List<StudentDto> findByStudentNameOrderBy(String studentName);

}