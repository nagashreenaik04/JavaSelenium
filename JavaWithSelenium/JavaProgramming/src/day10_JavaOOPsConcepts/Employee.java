package day10_JavaOOPsConcepts;

public class Employee {
	
	//variables
	int eid;
	String ename;
	String job;
	int sal;
	
	//methods
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
	}
	
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Emp e= new Employee(); //Emp cannot be resolved to a type. only class can consider as type 
		Employee emp1= new Employee(); //Object
		emp1.eid=101;
		emp1.ename="John";
		emp1.job= "Manager";
		emp1.sal=50000;
		emp1.display();
		
		Employee emp2= new Employee(); //Object
		emp2.eid=101;
		emp2.ename="David";
		emp2.job= "Engineer";
		emp2.sal=30000;
		emp2.display();

	}*/

}
