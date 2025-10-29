package day12_PolymorphismAndEncapsulation;

public class AdderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Adder addobj= new Adder();
		
		addobj.sum(); //1
		
		addobj.sum(100, 200); //2
		
		addobj.sum(10, 15.5); //3
		
		addobj.sum(10.5, 20); //4
		
		addobj.sum( 10, 20, 30); //5
		
		//addobj.sum(10.5,20.5,30.5); //invalid method - the sum(double,double,double is not there

	}

}
