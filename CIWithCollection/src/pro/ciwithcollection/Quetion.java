package pro.ciwithcollection;

import java.util.Iterator;
import java.util.List;

public class Quetion {
	
	
	private int sid;
	private String name;
	private List<String> ans;
	
	
	private Quetion(int sid, String name , List<String> ans)
	{
		this.sid=sid;
		this.name=name;
		this.ans=ans;
	}
	
	public void show()
	{
		
		System.out.println("sid "+sid);
		System.out.println("name "+name);
		
		Iterator <String> i=ans.iterator();
		
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	

}
