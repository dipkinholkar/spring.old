package com.nt.bean;

import java.util.Date;

public class WishMessage {
	
	private Date date;
	
	public void setDate(Date date)
	{
		this.date=date;
	}
	
	
	public String getMessage(String name)
	{
		int hour =0;
		
		hour=date.getHours();
		
		if(hour<=12)
		{
			return "Good Morning :"+name+" :"+hour;
		}
			
		else if(hour<=16)
		{
			
			return "Good Afternoon :"+name+" :"+hour;
		}
		else if(hour<=20)
		{
			
			return "Good Evening :"+name+" :"+hour;
		}
		else
		{
			return "Good Night :"+name+" :"+hour;
		}
	}

}
