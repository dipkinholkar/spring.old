package com.nt.bean;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class Test {  
public static void main(String[] args) throws FileNotFoundException, IOException {  
    Resource resource=new ClassPathResource("applicationContext.xml");  
    
    Properties props = new Properties();
    props.load(new FileInputStream("src/log4j.properties"));
    PropertyConfigurator.configure(props);
    
    BeanFactory factory=new XmlBeanFactory(resource);  
      
    Student student=(Student)factory.getBean("studentbean");  
    student.displayInfo();  
}  
}  