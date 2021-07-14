package inheritancePractice;

import java.util.ArrayList;

public class WithArrTest {

	public static void main(String[] args) {
		
		ArrayList <Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(001, "이순신");
		Customer customerShin = new Customer(002, "신사임당");
		GoldCustomer customerHong = new GoldCustomer(003, "홍길동");
		GoldCustomer2 customerYul = new GoldCustomer2(004, "율곡");
		VIPCustomer customerKim = new VIPCustomer(005, "김유신", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerKim);
		
		for(Customer c : customerList) {
			
			int price = c.calcPrice(10000);                        //코드 하나로 다양하게 구현 가능 == 다형성(폴리모피즘)
			System.out.println(c.showCustomerInfo());
			System.out.println(c.customerName +"님이 " + price +"를 지불하셨습니다. \n");
		}
		

	}

}
