package com.zensarspringbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensarspringbootdemo.entity.Details;
@Repository
public interface UserRepository extends JpaRepository<Details, Integer> {

	
}
