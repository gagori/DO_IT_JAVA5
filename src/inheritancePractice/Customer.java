package inheritancePractice;

public class Customer {   //상위클래스, calcPrice(), 
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	
	//디폴트 생성자 ID, NAME요구
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	//정보 메서드 요구
	public String  showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 "+ bonusPoint + "입니다.";
	}
	
	//calcPrice 메서드
	public int calcPrice( int price ) {     //지불금액, 보너스 포인트 계산법.
		bonusPoint += price*bonusRatio ;
		return price;
	}

}
