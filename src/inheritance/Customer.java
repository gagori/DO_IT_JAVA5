package inheritance;

public class Customer {                              
	
	protected int customerID;                      
	protected String customerName;					
	protected String customerGrade;
	int bonusPoint;				
	protected double bonusRatio;        
	
	
	public Customer(int customerID, String customerName) {       
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
	}
	
	public int calcPrice(int price) {       // 이 계산식은 vip에게는 맞지 않다. vip쪽에서 오버라이딩 하여 메서드를 재정립할 수 있다.
		bonusPoint += price*bonusRatio;    
		return price;	
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 "+customerGrade+"이며, 보너스 포인트는 "+bonusPoint+"입니다.";
	}

	
	public int getCustomerID() {             //get, set 메서드
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	

}
