package com.tnsif.scannerclass;

import java.util.Scanner;

public class Scannerexp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name ");
		String name = sc.nextLine();
		System.out.println("Enter your roll number ");
		int rollno = sc.nextInt();
		System.out.println("Name "+name+" Rollno "+rollno);
	}

}
