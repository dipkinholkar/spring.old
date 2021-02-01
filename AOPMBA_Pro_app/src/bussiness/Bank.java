package bussiness;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Bank {
	
	
	private int amount1=1000;
	private String accno="12421SBI";
	
	public int deposit(String accno , int amount) 
	{
	 if(accno.equals(this.accno))
	 {
		 System.out.print("in Deposit method");
		 this.amount1=this.amount1+amount;
		 return amount1;
	 }else
	 {
		 throw new AccountNumberNotFoundException();	 
				 
	 }
	}

}
