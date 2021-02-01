package pro.car_engine;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
	
		
		
ClassPathResource r=new ClassPathResource("pro/car_engine/spring2.xml");
		
		
		
		
		
		BeanFactory bf=new XmlBeanFactory(r);
		
		Car c=(Car)bf.getBean("c");
		
		c.show();
		
		
		
		
	}

}
