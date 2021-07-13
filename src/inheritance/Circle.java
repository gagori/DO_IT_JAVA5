package inheritance;

public class Circle  {
	
	Point point;                          //has - a 관계 == 합성  / is - a 관계  == 상속
	
	private int radius;
	
	public Circle() {  					// 이건 상속이 아니라 합성이다!       코드의 재사용의 두가지 방법 1.합성 2.상속
		point = new Point();  
	}

}
