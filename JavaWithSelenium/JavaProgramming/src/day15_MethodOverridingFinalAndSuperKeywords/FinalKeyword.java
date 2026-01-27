package day15_MethodOverridingFinalAndSuperKeywords;

class Test
{
	int x=100;
	final int y=200;
}
public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t=new Test();
		System.out.println(t.x);//100
		t.x=200;
		System.out.println(t.x);//200
		//t.y=200; //The final field Test.y cannot be assigned

	}

}
