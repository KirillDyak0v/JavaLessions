package com.lessons;

public class Lesson12 {
	public static void main(String[] args){
		int[] numbers = new int[5];
		numbers[0] = 10;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
//***************************************
		String[] string = new String[3];
		string[0] = "Hello";
		string[1] = "How are you?";
		string[2] = "Good bye";
		for(int i = 0; i<3;i++) {
			System.out.println(string[i]);
		}
		int [] num1 = {1,2,3};
		int sum = 0;
		for (int x:num1) {
			sum = sum+x;
			System.out.println(sum);
		}
		
	}

}
