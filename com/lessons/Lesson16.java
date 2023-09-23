package com.lessons;

public class Lesson16 {
	public static void main(String[] args) {
		InfoAuto car1 = new InfoAuto();
		car1.brand = "TOYOTA";
		car1.color = "Black";
		car1.age = 18;
		car1.displayOn();
		int y1 = car1.yearsOld();
		System.out.println(y1);
		InfoAuto car2 = new InfoAuto();
		car2.brand = "NISSAN";
		car2.color = "White";
		car2.age = 32;
		car2.displayOn();
		int y2 = car2.yearsOld();
		System.out.println(y2);
	}
}
class InfoAuto {
	String brand;
	String color;
	int age;
	int yearsOld() {
		int years = 2023-age;
		return years;
		
	}
	void displayOn() {
		for(int i = 0;i<1;i++) {
		System.out.println("|Марка: "+ brand + "| Цвет: " + color + " |Возраст: " + age+"|");}
	}
}
