package inheritancePractice;

public class GoldCustomer2 extends Customer {
	
	double saleRatio;
	
	public GoldCustomer2 (int customerID, String customerName) {
		
		super(customerID, customerName);
		bonusRatio = 0.02;
		saleRatio = 0.1;
		customerGrade = "GOLD_2";
		
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price -(int)(price*saleRatio)  ;
	}
	
	

}
