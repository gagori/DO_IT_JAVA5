package inheritance;

public class OverridingTest {

	public static void main(String[] args) {

//		Customer customerLee = new Customer(100010, "Lee");
//		int price = customerLee.calcPrice(10000);
//		System.out.println("지불 금액은 " + price + "원 이고, "+customerLee.showCustomerInfo()); 
//		
//		VIPCustomer customerKim = new VIPCustomer(100011, "KIM", 70);
//		price = customerKim.calcPrice(10000);
//		System.out.println("지불 금액은 " + price + "원 이고, "+customerLee.showCustomerInfo()); 
		
		Customer customerWho = new VIPCustomer(100011, "Who", 70);             // 업캐스팅. 인스턴스는 VIPCustomer 이지만 타입은 Customer
		int price = customerWho.calcPrice(10000);                              // 불리는 메서드  == VIP메서드
																				// == 가상함수.
																			   //재정의 되지 않으면 Customer 클래스의 메서드가 나오지만, 제정의 되면 VIPC 클래스의 메서드가 나온다.
																			//다형성 == 코드 한줄이 다양한 구현을 나타낼 수 있음.
		
		System.out.println("지불 금액은 " + price + "원 이고, "+customerWho.showCustomerInfo()); 
		
		
	}

}
