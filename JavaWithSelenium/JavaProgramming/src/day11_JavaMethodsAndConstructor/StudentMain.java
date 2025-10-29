package day11_JavaMethodsAndConstructor;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Student stu =new Student();
		
		//1)using object reference variables
		/*stu.sid=101;
		stu.sname="John";
		stu.grade='A';
		stu.printStudentData();
		*/
		
		//2)using method
		//stu.setStudentData(102, "David", 'A');
		//stu.printStudentData();
		
		//3)using Constructor
		Student stu =new Student(103,"Ram",'A');
		stu.printStudentData();
		
		

	}

}
