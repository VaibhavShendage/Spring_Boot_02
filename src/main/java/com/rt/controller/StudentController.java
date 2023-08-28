package com.rt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rt.entities.Student;
import com.rt.service.StudentService;
//@PropertySource(value = "classpath:Student_properties")
@RestController
public class StudentController {
	@Autowired
	StudentService ss;
	
	@Value("${message}")
	private String msg;
	
	@Value("${welmessage}")
	private String msgs;
	
	
	@PostMapping("/Student")
	public String AddStd(@RequestBody Student st){
		
    ss.AddStd(st);
		
		return "Student Added Successful ";	
	}
//-----------------------Get BY id--------------------------------
	@GetMapping("/Student/id/{id}")
	public Student getStdById(@PathVariable int id){
		
      Student st = ss.getStdById(id);
		System.out.println(msg);
		return st;
	}
	//----------------------Delete-------------------------
	@DeleteMapping("/Student/id/{id}")
	public String DeleteST(@PathVariable int id){
		
      Student st = ss.DeleteST(id);
		
		return "Delete Student Data Succesfully..";
	}
	//----------------------Update-------------------------
	@PutMapping("update/id/{id}")
	public String UpdateST(@RequestBody Student st){
		
		ss.UpdateST(st);
		
		return "Update Student Data Succesfully..";
	}
	
	//----------------------Select By Name--------------------------------
	
	@GetMapping("/name/{name}")
	public List<Student> getStdByName(@PathVariable String name){
		
     List<Student> st = ss .getStdByName(name);
     System.out.println(msgs);
		return st;
	}
	//--------------------SelectAll----------------------------------------
	@GetMapping("/allStudent")
	public List<Student> AllStudent(){
		List<Student> list = ss.AllStudent();
		return list;
	}
	
}
