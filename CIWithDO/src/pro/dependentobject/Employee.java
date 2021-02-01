package pro.dependentobject;

public class Employee {

	

		private int empid;
		private String empname;
		private Address address;
		
		public Employee(int empid, String empname, Address address)
		{
			super();
			this.empid=empid;
			this.empname=empname;
			this.address=address;
		}
		
		
		public void show()
		{
			System.out.print(empid+" "+empname+" "+address.getAddress());
		}
	
	
	
	
	
	
}
