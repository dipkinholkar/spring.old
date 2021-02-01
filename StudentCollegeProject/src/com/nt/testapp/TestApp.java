package com.nt.testapp;
import java.util.List;
import java.util.ArrayList;

import com.nt.college.Student;
import com.nt.department.Department;
import com.nt.institute.Institute;
public class TestApp {
	
	public static void main(String args[])
	{
		Student s1=new Student(101,"Dipak" , "CSE");
		Student s2=new Student(102,"Mahesh" , "EEE");
		Student s3=new Student(103,"Atish" , "CSE");
		Student s4=new Student(104,"Anurag" , "EEE");
		Student s5=new Student(105,"Anurag" , "EEE");
		
		
		List<Student> cses=new ArrayList<Student>();
		
		cses.add(s1);
		cses.add(s3);
		


	List<Student> eees=new ArrayList<Student>();
		
		eees.add(s2);
		eees.add(s4);
		eees.add(s5);
	Department cse=new Department("CSE",cses);
		
	Department eee=new Department("EEE",eees);

	List<Department> d=new ArrayList<Department>();
	
	d.add(cse);
	d.add(eee);


	Institute i=new Institute("BITS", d);
	
	System.out.print("Total no of Students : ");

	System.out.println(i.getTotalStudent());
	
		
	}

}
