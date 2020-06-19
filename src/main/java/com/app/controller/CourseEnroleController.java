package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Cenrole;
import com.app.repository.CourseEnroleRepository;

@RestController
@RequestMapping("student")
public class CourseEnroleController {
	
	@Autowired
	private CourseEnroleRepository repository;
	
	@RequestMapping(value = "/enroleCourse", method = RequestMethod.POST)
	public Cenrole enroleCourse(@RequestBody Cenrole cenrole) {
		return repository.save(cenrole);
	}
	
	@RequestMapping(value ="getAllCourseEnrolemets", method=RequestMethod.GET)
	public List<Cenrole> getAllCourseEnrolemets() {
		return repository.findAll();
	}	
	
	@RequestMapping(value ="getCourseEnrolementsByStudent/{id}", method=RequestMethod.GET)
	public List<Cenrole> getStudent(@PathVariable("id") Long id) {
		return repository.getCourseEnrolementsByStudent(id);
	}
	
	@RequestMapping(value ="getCourseEnrolementsByStudent/{sname}", method=RequestMethod.GET)
	public Cenrole getStudent(@PathVariable("id") String sname) {
		//return repository.findById(id).get();
		return null;
	}

	
}
