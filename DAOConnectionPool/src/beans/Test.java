package beans;

import java.sql.Connection;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;

public class Test {

	public static void main(String[] args) {

		
		
		BasicDataSource bds=new BasicDataSource();
		
		
		bds.setDriverClassName("oracle.jdbc.OracleDriver");
		bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		bds.setUsername("dipak");
		bds.setPassword("dipak");
		bds.setMaxActive(20);
		bds.setMaxIdle(5);
		bds.setMaxWait(1000*5);
		
		
		for(int i=0; i<2000; i++)
		{
			try {
				Connection con=bds.getConnection();
				System.out.println(i+"  "+con);
				con.close();
			}
			catch(Exception e)
			{
				System.out.print(e);
			}
		}
		
	}

}
