package com.example.app;

public class Calc {
	
	public int calc(String num1, String num2, String cal) {
		int result = 0;
		int number1 = Integer.parseInt(num1);
		int number2 = Integer.parseInt(num2);
		
		switch (cal) {
		case "+": {
			result = number1 + number2;
			break;
		}
		case "-": {
			result = number1 - number2;
			break;
		}
		case "/": {
			result = number1 / number2;
		}
		case "*": {
			result = number1 * number2;
		}
		default:
			break;
		}
		
		return result;
	}
	
}
