package com.java.lessons;

public class Lesson14 {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.brand = "TOYOTA";
		car1.color = "Black";
		car1.age = 7;
		System.out.println("|Марка: "+ car1.brand + "| Цвет: " + car1.color + " |Возраст: " + car1.age+"|");
		Car car2 = new Car();
		car2.brand = "NISSAN";
		car2.color = "White";
		car2.age = 3;
		System.out.println("|Марка: "+ car2.brand + "| Цвет: " + car2.color + " |Возраст: " + car2.age+"|");
	}
	}
class Car {
	String brand;
	String color;
	int age;
}

