
public class VendingMachine {
	int price = 80;
	int balance;
	int total;
	
	VendingMachine()
	{
		total = 0;
		
	}
	
	void showBalance()
	{
		System.out.println(balance);
		
	}
	
	void showProm()
	{
		System.out.println("Welcome");
	}
	
	void insertMoney(int money)
	{
		balance += money;
	}
	
	void getFood(int price)
	{
		if(balance > price) {
			System.out.println("here you are");
			balance -= price;
			total += price;
		}
	}
	public static void main(String[] args) {
		VendingMachine v1 = new VendingMachine();
		v1.showProm();
		v1.insertMoney(100);
		v1.getFood(80);

	}

}
