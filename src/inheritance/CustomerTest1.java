package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {

		
//		Customer customerLee = new Customer();
//		customerLee.setCustomerID(10100);
//		customerLee.setCustomerName("이발소");
//		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10101, "김부각");
//		Customer customerKim = new VIPCustomer(10101, "김부각");        //vip는 customer이기 때문에 상위클래스로 형변환 가능.==업캐스팅. 
																		//단 이때 가시성은 customer까지만, 즉 vip변수인 agentID등 못본다!
//		customerKim.setCustomerID(10101);
//		customerKim.setCustomerName("김부각");
		customerKim.bonusPoint = 50000;
		
//		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
		
		
	}

}
