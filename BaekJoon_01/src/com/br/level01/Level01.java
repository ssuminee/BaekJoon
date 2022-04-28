package com.br.level01;

import java.util.Scanner;

public class Level01 {
	
	public void problem01() {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = str1;

		if(str1.equals(str2)) {
			System.out.print(str1 + "??!");
		}
	}
	
	public void problem02() {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int byear = y - 543;
		System.out.println(byear);
	}
	
	public void problem03() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);
	}
	
	public void problem04() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a * (b % 10));
		System.out.println(a * ((b % 100) / 10));
		System.out.println(a * (b / 100));
		System.out.println(a * b);
	}
	
}