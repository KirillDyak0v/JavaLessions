package com.lessons;

public class Lesson9 {

	public static void main(String[] args) {
	while(true) {
		System.out.println("hola");
		break;
	}
	for(int i = 0;i<150;i++) {
	if(i%2==0) {
		continue;
	}
	System.out.println("Это нечетнное число "+i);
	}
	
	}

}
