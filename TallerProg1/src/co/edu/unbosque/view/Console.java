package co.edu.unbosque.view;

import java.util.Scanner;

public class Console {

	private Scanner sc;

	public Console() {
		sc = new Scanner(System.in);
	}

	public int readInt() {
		return sc.nextInt();
	}

	public String readLine() {
		return sc.nextLine();
	}

	public String read() {
		return sc.next();
	}

	public double readDouble() {
		return sc.nextDouble();
	}

	public void printLine(String text) {
		System.out.println(text);
	}

	public void print(String text) {
		System.out.print(text);
	}

}
