package com.nt.institute;

import com.nt.college.Student;
import com.nt.department.Department;
import java.util.List;
public class Institute {
	
	private String sname;
	private List<Department> dept;
	
	
	public Institute(String sname , List<Department> dept)
	{
		
		this.sname=sname;
		this.dept=dept;
		
	}
	
	public int getTotalStudent()
	{
		int no=0;
		
		List<Student> stud;
		
		for(Department dept : dept)
		{
			stud=dept.getStudent();
			
			for(Student s : stud)
			{
				no +=1;
				
			}
			
		}
		return no;
		
		
		
	}
	
	
	

}
