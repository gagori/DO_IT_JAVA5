//package inheritance;
//
//public class CustomerWrongCase {                             //상위 클래스
//	
//	private int customerID;
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;				//보너스 포인트
//	double bonusRatio;          //적립비율
//	
//	
//	private int saleRatio;          //할인율            //사실 일반고객은 필요없음,, 점점 늘어날 것이다. 유지 보수 어렵
//	private int agentID;            //전문상담원
//	
//	
//	
//	public CustomerWrongCase() {                 //디폴트 생성자
//		customerGrade = "SILVER";       //기본 등급
//		bonusRatio = 0.01;            	//기본 적립비율
//	}
//	
//	public int calcPrice(int price) {      //보너스 포인트 적립, 지불가격 계산 메서드
//		
//		if(customerGrade == "SILVER") {
//			bonusPoint += price*bonusRatio;   //보너스 포인트 계산
//		} else if(customerGrade == "VIP") {
//			
//			//여기다 할인도 추가, 전문상담원 추가
//		} else if(customerGrade == "GOLD") {    //또추가...점점 늘어날 것이다.     유지보수 어렵
//			//또 추가
//		}
//		return price;	
//		
//		
//	}
//	
//	public String showCustomerInfo() {
//		return customerName + " 님의 등급은 "+customerGrade+"이며, 보너스 포인트는 "+bonusPoint+"입니다.";
//	}
//
//	public int getCustomerID() {             //get, set 메서드
//		return customerID;
//	}
//
//	public void setCustomerID(int customerID) {
//		this.customerID = customerID;
//	}
//
//	public String getCustomerName() {
//		return customerName;
//	}
//
//	public void setCustomerName(String customerName) {
//		this.customerName = customerName;
//	}
//
//	public String getCustomerGrade() {
//		return customerGrade;
//	}
//
//	public void setCustomerGrade(String customerGrade) {
//		this.customerGrade = customerGrade;
//	}
//	
//	
//
//}
