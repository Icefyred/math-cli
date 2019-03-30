package pt.compta.math.cli;

import pt.compta.tools.fourthmaven.MathUtils;

public class App {
	public static void main(String[] args) {
		//sum args[0], firstNumber args[1], secondNumber args[2]
		int firstNumber, secondNumber;
		
		firstNumber = Integer.parseInt(args[1]);
		secondNumber = Integer.parseInt(args[2]);
		String typeOfOperation = args[0];
		
		String resultFromOpeartions = "Result: ";
		
		if(typeOfOperation.equals("sum")) {
			resultFromOpeartions += MathUtils.sumOfTwoNumbers(firstNumber, secondNumber);
		}
		else {
			resultFromOpeartions += MathUtils.subtractOfTwoNumbers(firstNumber, secondNumber);
		}
		
		System.out.println(resultFromOpeartions);
		
	}
}
