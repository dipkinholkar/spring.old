package pro.ciwithcollection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	
	public static void main(String args[])
	{
	Resource rs=new ClassPathResource("pro/ciwithcollection/spring.xml");
	
	BeanFactory b=new XmlBeanFactory(rs);
	
	Quetion q=(Quetion) b.getBean("q");
	
	q.show();

}
}