package pro.dependson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testing {

	public static void main(String[] args) {
	
		
		ApplicationContext a=new ClassPathXmlApplicationContext("pro/dependson/spring.xml");
		
		
	}

}
