package witharraylist;

public class VIPCustomer extends Customer {           
	
	private int agentID;
	private double saleRatio;
	
	public VIPCustomer (int customerID, String customerName, int agentID) {         
		
		super(customerID, customerName);        
		customerGrade ="VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	public int calcPrice(int price) {            // 오버로딩 != 오버라이딩 .......오버로딩은 이름이 같은 메서드 여러개/ 오버라이딩은 덮어 쓴다!
		bonusPoint += price * bonusRatio;    
		return price - (int)( price * saleRatio );
	}
	
	
	
	public int getAgentID(){
		return agentID;
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "	담당상담원 ID는 " +agentID+"입니다.";                 //super가 있어야 상위클래스꺼를 불러온다.
	}

}
