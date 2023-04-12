package com.java.lessons;

public class Lesson15 {

	public static void main(String[] args) {
		Les car1 = new Les();
		car1.brand = "TOYOTA";
		car1.color = "Black";
		car1.age = 7;
		car1.displayOn();
		Les car2 = new Les();
		car2.brand = "NISSAN";
		car2.color = "White";
		car2.age = 3;
		car2.displayOn();
	}
	}
class Les {
	String brand;
	String color;
	int age;
	void displayOn() {
		for(int i = 0;i<1;i++) {
		System.out.println("|Марка: "+ brand + "| Цвет: " + color + " |Возраст: " + age+"|");}
	}
}

