package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			System.out.println("계산식 입력");
			String str = scanner.nextLine();
			if (str.equals("quit")) {
				break;
			} else {
			
			String[] tokens = str.split(" ");
			
			int a = Integer.parseInt(tokens[0]);
			int b = Integer.parseInt(tokens[2]);
			String op = tokens[1];
			System.out.println(op);
			switch (op) {
				case "+":
					Add add = new Add();
					add.setValue(a, b);
					int resultAdd = add.calculate();
					System.out.println(resultAdd);
					break;
				case "-":
					Sub sub = new Sub();
					sub.setValue(a, b);
					int resultSub = sub.calculate();
					System.out.println(resultSub);
					break;
				case "*":
					Multi multi = new Multi();
					multi.setValue(a, b);
					int resultMulti = multi.calculate();
					System.out.println(resultMulti);
					break;
				case "/":
					Div div = new Div();
					div.setValue(a, b);
					int resultDiv = div.calculate();
					System.out.println(resultDiv);
					break;
				}
			}
		}
		scanner.close();
	}

}
