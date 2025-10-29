package day12_PolymorphismAndEncapsulation;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc= new Account();
		
		acc.setAccNo(101);
		acc.setName("John");
		acc.setAmount(56000);
		
		System.out.println(acc.getAccno());
		System.out.println(acc.getName());
		System.out.println(acc.getAmount());
		

	}

}
