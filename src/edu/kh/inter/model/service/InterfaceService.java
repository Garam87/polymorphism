package edu.kh.inter.model.service;

import edu.kh.inter.model.vo.Cat;
import edu.kh.inter.model.vo.Chicken;
import edu.kh.inter.model.vo.Dog;
import edu.kh.inter.model.vo.Eagle;
import edu.kh.inter.model.vo.Penguin;
import edu.kh.inter.model.vo.Shark;
import edu.kh.inter.model.vo.TypeBirds;
import edu.kh.inter.model.vo.TypeMammalia;
import edu.kh.inter.model.vo.TypePisces;
import edu.kh.inter.model.vo.WaterLife;
import edu.kh.inter.model.vo.Whale;

public class InterfaceService {

	public void ex1() {
	
		Cat cat = new Cat();
		Dog dog = new Dog();
		Chicken chicken = new Chicken();
		Eagle eagel = new Eagle();
		Penguin penguin = new Penguin();
		Shark shark = new Shark();
		Whale whale = new Whale();
    
		TypeBirds[] birds = new TypeBirds[] {chicken, eagel, penguin};
		TypeMammalia[] mammalia = new TypeMammalia[] {cat, dog, whale};
		TypePisces[] pisces = new TypePisces[] {shark};
		
		WaterLife[] waterLife = new WaterLife[] {
			(WaterLife)whale, penguin, shark	
		};
		
		for(int i = 0; i < waterLife.length; i++) {
			waterLife[i].water();
			System.out.println(waterLife[i].MONDAY);
			// 관계가 전혀 없는 것들의 관계를 만들어 주는게 인터페이스!
			// 고래, 펭귄, 상어를 묶어줄 수 있는 이유가
			// WaterLife라는 인터페이스가 있기 때문이다.
		}
		

	}
}
