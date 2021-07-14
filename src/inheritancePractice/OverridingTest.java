package inheritancePractice;

public class OverridingTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(100010, "Lee");
		int price = customerLee.calcPrice(10000);
		System.out.println("지불 금액은 " + price + "원 이고, "+customerLee.showCustomerInfo()); 

		
		VIPCustomer customerKim = new VIPCustomer(100011, "KIM", 70);
		price = customerKim.calcPrice(10000);
		System.out.println("지불 금액은 " + price + "원 이고, "+customerKim.showCustomerInfo()); 
		
		
		Customer customerGold = new GoldCustomer(100002, "Jung");
		price = customerGold.calcPrice(10000);
		System.out.println("지불 금액은 " + price + "원 이고, "+customerGold.showCustomerInfo());
		
		Customer customerGold2 = new GoldCustomer2(100012, "Kang");
		price = customerGold2.calcPrice(10000);
		System.out.println("지불 금액은 " + price + "원 이고, "+customerGold2.showCustomerInfo());
		
		
	}

}
