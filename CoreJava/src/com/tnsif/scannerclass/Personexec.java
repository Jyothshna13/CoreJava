package com.tnsif.scannerclass;

import java.util.Scanner;

public class Personexec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter person name");
		String name=sc.nextLine();
		System.out.println("Enter person income");
		int income=sc.nextInt();
		Person pp = new Person();
		pp.setName(name);
		pp.setIncome(income);
		TaxCalculation t = new TaxCalculation();
		t.caluculation(pp);
		System.out.println("After modification");
		System.out.println(pp);
		
	}

}
