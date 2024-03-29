package com.zensar.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.zensar.bean.Employee;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer>{
	
}