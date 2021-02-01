package test;

import org.springframework.aop.framework.ProxyFactoryBean;

import bussiness.Bank;
import services.LogBeforeService;

public class Client {

	public static void main(String[] args) {
		
		Bank b=new Bank();
		
		LogBeforeService lbs=new LogBeforeService();
		
		ProxyFactoryBean pfb=new ProxyFactoryBean();
		
		pfb.setTarget(b);
		
		pfb.addAdvice(lbs);
		
		Bank bproxy=(Bank)pfb.getObject();
		
bproxy.deposit("12421SBI",10000);

	}

}
