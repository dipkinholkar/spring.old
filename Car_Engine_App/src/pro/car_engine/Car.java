package pro.car_engine;

public class Car {
	
	
	private Engine e;
	private String carName;
	
	
	public void setEngine(Engine e)
	{
		
		this.e=e;
	}
	
	public void setcarName(String carName)
	{
		this.carName=carName;
	}
	
	public void show()
	{
		System.out.print("carname :"+carName+" "+e.getModelName());
	}
}
