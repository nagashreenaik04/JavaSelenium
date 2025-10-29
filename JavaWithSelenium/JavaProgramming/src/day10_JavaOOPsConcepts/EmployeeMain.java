package day10_JavaOOPsConcepts;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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

	}

}
