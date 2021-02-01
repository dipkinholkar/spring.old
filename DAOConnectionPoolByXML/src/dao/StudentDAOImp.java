package dao;

import java.sql.Connection;
import javax.activation.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDAOImp implements StudentDAO {

	private DataSource ds;
	
	


	public void setDs(DataSource ds) {
		this.ds = ds;
	}
	

	@Override
	public int save(Student stud) throws Exception {
	
		Connection con=ds.getConnection();
		con.close();
		return 0;
	}

	public static void main(String args[])
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
	      
			Student s=new Student();
	     StudentDAO stud=(StudentDAO)ctx.getBean("dao");  
	     
	    int status=StudentDAO.save(s);  
	    System.out.println(status);  
	          
	}


}
