package day13_ThisAndStaticKeywords;

public class ThisKeyword {

	int x,y; //class variable /instance variables
	
	/*
	ThisKeyword(int a, int b)
	{
		x=a; //x=x;
		y=b; //y=y;
	}
	*/
	
	ThisKeyword(int x, int y)
	{
		this.x=x; 
		this.y=y; 
	}
	
	void setData(int x, int y)
	{
		x=x;
		y=y;
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeyword th= new ThisKeyword(100,200);
		th.display();//100,200(a,b)//0,0(x,y)
		
		//ThisKeyword th=new ThisKeyword();
		//th.display();

	}

}
