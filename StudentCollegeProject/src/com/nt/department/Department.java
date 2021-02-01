package com.nt.department;

import com.nt.college.Student;

import java.util.List;
public class Department {
	
	private String sdept;
	private List<Student> stud;
	
	public Department(String sdept , List<Student> stud)
	{
		this.sdept=sdept;
		this.stud=stud;
	}
	
	public List<Student> getStudent()
	{
		
		return stud;
	}
	

}
