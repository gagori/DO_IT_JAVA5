package inheritancePractice;

public class GoldCustomer extends Customer {
	
	public GoldCustomer(int customerID, String customerName) {
		
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.05;
		
	}

}
