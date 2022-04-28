package com.br.control;

import java.util.Scanner;

public class Level2 {
	public void problem1() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a == b) {
			System.out.println("==");
		}
		else if(a > b) {
			System.out.println(">");
		}
		else {
			System.out.println("<");
		}
	}

	public void problem2() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a >= 90 && a <= 100)
			System.out.println("A");
		else if(a >= 80)
			System.out.println("B");
		else if(a >= 70)
			System.out.println("C");
		else if(a >= 60)
			System.out.println("D");
		else
			System.out.println("F");
	}

	public void problem3() {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();

		if(y % 4 == 0 && ((y % 100 != 0) || (y % 400 == 0)))
			System.out.println("1");
		else
			System.out.println("0");

	}

	public void problem4() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x > 0 && y > 0)
			System.out.println("1");
		else if(x > 0 && y < 0)
			System.out.println("4");
		else if(x < 0 && y > 0)
			System.out.println("2");
		else if(x < 0 && y < 0)
			System.out.println("3");
	}

	public void problem5() {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();

		if(m < 45) {
			h--;
			m += 15;
			if(h < 0) {
				h = 23;
			}
			System.out.println(h + " " + m);
		}
		else {
			System.out.println(h + " " + (m - 45));
		}
	}

	public void problem6() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = a * 60 + b + c;
		a = sum / 60;
		b = sum % 60;
		if(a >= 24) {
			a -= 24;
			System.out.println(a + " " + b);
		}
		else {
			System.out.println(a + " " + b);
		}
	}

	public void problem7() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a == b && b == c)
			System.out.println(10000 + a * 1000);
		else if(a == b || b == c)
			System.out.println(1000 + 100 * b);
		else if(a == c)
			System.out.println(1000 + 100 * a);
		else if(a > b && a > c)
			System.out.println(100 * a);
		else if(a < b && b > c)
			System.out.println(100 * b);
		else
			System.out.println(100 * c);
	}
}
