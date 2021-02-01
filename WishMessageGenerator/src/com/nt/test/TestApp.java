package com.nt.test;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.bean.WishMessage;

public class TestApp {

	public static void main(String[] args) {

		WishMessage msg=null;
		FileSystemResource res=null;
		BeanFactory factory=null;
		Object obj=null;
		res=new FileSystemResource("src/com/nt/config/applicationContext.xml");
		
		factory=new XmlBeanFactory(res);
		
		obj=factory.getBean("wish");
		
		msg=(WishMessage)obj;
		
		System.out.print("Message:"+msg.getMessage("dipak"));
	}

}
