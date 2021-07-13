package inheritance;

public class VIPCustomer extends Customer {           //상속받는 방법. 상속받으면 상위클래스의 코드는 모두 물려받고, 
													  //하위클래스에는 추가되는 부분만 코딩한다.
	private int agentID;
	private double saleRatio;
	
	public VIPCustomer (int customerID, String customerName) {            //VIP고객의 디폴트 생성자   //상위 클래스에서 매개변수가 있다면 통일성있게 바꿔주기!!
		
//		super();                      //상위클래스가 먼저 호출되고 하위클래스가 먼저 호출됨.   자동으로 생성자 생김. 상위클래스 호출 하는 생성자 super();
		super(customerID,customerName);         //이땐 명시적으로 super를 불러야함.    //상위클래스 생성자 생각하면 오버라이팅 된것
		customerGrade ="VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) 호출");
	}
	
	public int getAgentID(){
		return agentID;
	}

}
