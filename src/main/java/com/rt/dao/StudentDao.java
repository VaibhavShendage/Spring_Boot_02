package com.rt.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.rt.entities.Student;
@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

	void save(int id);

	Optional<Student> findByName(int id);

	Student findByName(String name);

	



}
