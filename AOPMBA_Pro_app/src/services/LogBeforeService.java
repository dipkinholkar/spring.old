package services;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import bussiness.Bank;

public class LogBeforeService implements AfterReturningAdvice {
/*
	@Override
	public void before(Method m, Object[] param, Object obj) throws Throwable {
		
		
	}
*/
	@Override
	public void afterReturning(Object obj, Method m, Object[] obj1, Object obj2) throws Throwable {

		Log l=LogFactory.getLog(Bank.class);

		 l.info("obj:"+obj);
		 
			
	}
	
	
	

}
