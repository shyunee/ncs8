package sec04.exam05;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		System.out.print("구구단 몇 단 출력할까요?");
		int inputNum = scanner.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(inputNum + " X "+ i + " = " + (inputNum*i));
		}
	}

}
