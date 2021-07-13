package inheritance;

public class Customer {                               //상위 클래스
	
	protected int customerID;                         //하위 클래스에서 사용할 수 있도록 지정하는 예약어 protected
	protected String customerName;					  // 다른 패키지에 있어도 가시성.
	protected String customerGrade;
	int bonusPoint;				//보너스 포인트          //반면 디폴트 예약어는 같은 패키지 내에서만 가시성.
	protected double bonusRatio;          //적립비율
	
	
	
//	public Customer() {        //디폴트 생성자
//		customerGrade = "SILVER";       //기본 등급
//		bonusRatio = 0.01;            	//기본 적립비율
//		
//		System.out.println("Customer() 호출");
//	}
	
	public Customer(int customerID, String customerName) {       //이러한 생성자만 쓰겠다! 즉, 백엔드에서 id와 고객이름 받을 때 관리법. 이때 디폴트 생성자 없으므로 하위 클래스에서 에러뜸!!!
		
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer(int, String) 호출");
	}
	
	
	public int calcPrice(int price) {      //보너스 포인트 적립, 지불가격 계산 메서드
	
		if (customerGrade == "SILVER") {
			bonusPoint += price*bonusRatio;    //보너스 포인트 계산	
		}
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
