package inheritancePractice;

public class CustomerTest1 {

	public static void main(String[] args) {

		
		Customer customerLee = new Customer(10100, "이순신");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10101, "김유신",70);
		customerKim.bonusPoint = 50000;
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
		
		
		//이 상태에서 Customer와 VIPCustomer 클래스 만들어보기. 거꾸로 가보기. TDD!!연습
		
	}

}
