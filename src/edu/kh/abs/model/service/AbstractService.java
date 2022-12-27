package edu.kh.abs.model.service;

import edu.kh.abs.model.vo.Animal;
import edu.kh.abs.model.vo.Cat;
import edu.kh.abs.model.vo.Chicken;
import edu.kh.abs.model.vo.Dog;
import edu.kh.abs.model.vo.Eagle;
import edu.kh.abs.model.vo.Penguin;
import edu.kh.abs.model.vo.Shark;
import edu.kh.abs.model.vo.TypeBirds;
import edu.kh.abs.model.vo.TypeMammalia;
import edu.kh.abs.model.vo.TypePisces;
import edu.kh.abs.model.vo.Whale;

public class AbstractService {
	// Chicken
	// Eagle
	// Penguin
	// Shark
	// Whale
	
	// TypeBirds
	// TypeMammalia
	// TypePisces
	
	
	public void ex1() {
		//Animal a = new Animal(); 
		// 추상클래스는 객체로 만들수 없지만, 타입으로서의 역할은 한다.
		
		Chicken a = new Chicken();
		Eagle b = new Eagle();
		Cat c = new Cat();
		Dog d = new Dog();
		Penguin e = new Penguin();
		Whale f = new Whale();
		Shark g = new Shark();
		
		TypeMammalia[] mammalia = new TypeMammalia[] {c, d, f};
		TypeBirds[] birds = new TypeBirds[] {a, b, e};
		TypePisces[] pisces = new TypePisces[] {g};
		
		Animal[] animal = new Animal[] { a, b, c, d, e, f, g};
		
		for(int i = 0; i < animal.length; i++) {
			animal[i].cry();
			animal[i].eat();
			animal[i].move();
			// 만약 animal중에 타입이 고양이 일 때
			// 수유를 한다 == breastfeed() 출력
			if(animal[i] instanceof Cat) {
				System.out.println("===== 고양이는요! =====");
				((Cat)animal[i]).breastfeed();
				// 고양이가 소속되어있는 포유류만 가지고 있던 수유를하다 메서드.
				// Cat 클래스에서 오버라이딩으로 재정의된 내용이 출력된다.
				System.out.println("===== 이렇습니다. =====");
			}
			if(animal[i] instanceof Eagle) {
				System.out.println("===== 독수리는요! =====");
				Eagle eg = (Eagle) animal[i];
				eg.fly(); 
				System.out.println("===== 이렇습니다. =====");
			} 
			if(animal[i] instanceof Shark) {
				System.out.println("===== 상어는요! =====");
				Shark sk = (Shark) animal[i];
				sk.swimming();
				System.out.println("===== 이렇습니다. =====");
			} 
				
		}

	}
}
