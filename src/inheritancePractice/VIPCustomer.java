package inheritancePractice;

public class VIPCustomer extends Customer {
	
	double saleRatio = 0.1;      //상속되지 않는 부분이니까 바깥에(?) 써줌
	int agentID;
	
	public VIPCustomer(int customerID, String customerName, int agentID ) {
		
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		this.agentID = agentID;          //super 다음에 나와야함.
	}
	

	//calcPrice 오버라이딩
	@Override
	public int calcPrice (int price) {
		bonusPoint += price*bonusRatio ;
		return price - (int)(price*saleRatio);
		
	}

}
