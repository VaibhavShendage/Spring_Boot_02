package com.rt.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.rt.entities.Student;
@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

	void save(int id);

	//List<Student> findByName(String n);
	
//@Query(value= "select * from student where name = ?",nativeQuery = true )
//List<Student> abc(String name);

	
	//jpql
	@Query(value="select st from Student st where st.name=:n",nativeQuery = false)
	List<Student> abc(@Param("n")String n);
}


	
