package day12_PolymorphismAndEncapsulation;

public class Account {
	
	private int accno;
	private String name;
	private double amount;
	
	void setAccNo(int accno)
	{
		this.accno=accno;
	}
	
	int getAccno()
	{
		return accno;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	

}
