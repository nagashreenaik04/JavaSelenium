package day11_JavaMethodsAndConstructor;

public class GreetingsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greetings gr = new Greetings();
		gr.m1(); // 1
		
		String s=gr.m2(); //2
		System.out.println(s); //Hello how are you?
		
		gr.m3("John"); //3
		
		String value=gr.m4("David");
		System.out.println(value); //Hello David

	}

}
