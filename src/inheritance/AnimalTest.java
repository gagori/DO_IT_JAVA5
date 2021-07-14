package inheritance;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
class Human extends Animal	{
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
	
class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 날읍니다.");
	}
	public void bold() {
		System.out.println("대머리 입니다.");
	}
}
	
	
public class AnimalTest{	

	public static void main(String[] args) {
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		
//		Animal a = new Human() ;
		
		Animal[] animalList = new Animal[3];
		animalList[0] = new Human();
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Tiger());
	}
	
	public void moveAnimal( Animal animal ) {
		
		animal.move();                                        //코드는 이거 한줄인데. 다형성(polymorphism)
//		animal.                      //animal로 지정되었기에 tigerd의 hunting메서드는 보이지 않는다!
									//이때 필요한 것이 다운캐스팅.
		
//		Human h = (Human)animal;         //잘못 쓴 다운캐스팅
//		h.readBook();
		
		if (animal instanceof Human) {
			Human h = (Human)animal;
			h.readBook();
		} else if( animal instanceof Tiger) {
			Tiger t = (Tiger)animal;
			t.hunting();
		} else if( animal instanceof Eagle) {
			Eagle e = (Eagle)animal;
			e.bold();
		} else {
			System.out.println("지원 되지 않는 기능입니다.");
		}
		
		
	}
	
}
