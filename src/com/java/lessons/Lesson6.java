package com.java.lessons;

import java.util.Scanner;

public class Lesson6 {
		
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число от '0' до '10' если хотите вывести 'Hello'");
		i = sc.nextInt();
		if(i<=10) {
			System.out.println("Hello");
		}else{
			System.out.println("Вы ввели неверное значение");
		}
	}
}