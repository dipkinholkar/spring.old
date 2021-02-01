package pro.dependentobject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	
	public static void main(String args[])
	{
		
		Resource rs=new ClassPathResource("pro/config/spring.xml");

		
		BeanFactory b=new XmlBeanFactory(rs);
		
		
		Employee e=(Employee) b.getBean("e");
		
		e.show();
	}

}
