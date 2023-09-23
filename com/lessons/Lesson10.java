package com.lessons;

import java.util.Scanner;

public class Lesson10 {

	public static void main(String[] args) {
		int result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое число");
		int val1 = sc.nextInt();
		System.out.println("Введите знак '+ , - , * , /'");
		char operator = sc.next().charAt(0);
		System.out.println("Введите второе число");
		int val2 = sc.nextInt();
		switch(operator) {
		case '+' : result = val1 + val2;
		break;
		case '-' : result = val1 - val2;
		break;
		case '*' : result = val1 * val2;
		break;
		case '/' : result = val1 / val2;
		break;
		default:
		System.out.println("Вы допустили ошибку");
		}System.out.println("Ваш результат : "+result);
	}

}
