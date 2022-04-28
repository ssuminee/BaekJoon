package com.br.control;

import java.util.Scanner;

public class Level03 {
	public void problem01() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 1; i < 10; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}
	}

	public void problem02() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		for(int i = 0; i < a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(b+c);
		}
	}

	public void problem03() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= a; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public void problem05() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 1; i <= a; i++) {
			System.out.println(i);
		}
	}

	public void problem06() {
		Scanner sc = new Scanner(System.in);
		for(int i = sc.nextInt(); i > 0; i--) {
			System.out.println(i);
		}
	}

	public void problem07() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 1; i <= a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println("Case #" + i + ": " + (b + c));
		}
	}

	public void problem08() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 1; i <= a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.printf("Case #%d: %d + %d = %d\n", i, b, c, (b + c));
		}
	}

	public void problem09() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {	// มู
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void problem10() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {	// มู
			for(int j = a; j > (i + 1); j--) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void problem11() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int d = sc.nextInt();
			if(d < x)
				System.out.print(d + " ");
		}	
	}

	public void problem12() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; ;) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a == 0 && b == 0) {
				break;
			}
			System.out.println(a + b);
		}
	}

	public void problem14() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean bool = true;
		int d = a;
		int count = 0;
	
		while(bool) {
			int b = d / 10;
			int c = d % 10;
			int sum1 = b + c;
			d = (c * 10) + (sum1 % 10);
			if(a == d) {
			bool = false;
			}
			count++;
		}
		System.out.println(count);
		
	}
}
