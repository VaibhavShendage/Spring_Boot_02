package com.rt.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rt.dao.StudentDao;
import com.rt.entities.Student;
@Component
public class StudentService {
     @Autowired
	StudentDao Dao;
	
	
	public void AddStd(Student st) {
		
		Dao.save(st);
		
	}
	//----------------------------------------
	public Student getStdById (int id){
		Student st1 = null;
		Optional<Student> st = Dao.findById(id);
	
		if (st.isPresent()) {
			
			st1 = st.get();
			return st1;
			
		} 
		return st1;
	}
//---------------------------------------------------------
	public Student DeleteST(int id) {
		Dao.deleteById(id);
		return null;
	}
	
	//--------------------Update-----------------------------
	public Student UpdateST(Student st) {
		Dao.save(st);
		return null;
	}
	
	
	//----------------------All Student data------------------------
	
		
	public List<Student> AllStudent() {
		List<Student> list = Dao.findAll();
		return list;
	}
	//--------------------GetDataBy Name----------------------
	public Student getStdByName(String name) {
		
		Student list = Dao.findByName(name); 
		return list;
	}
	
	
}
