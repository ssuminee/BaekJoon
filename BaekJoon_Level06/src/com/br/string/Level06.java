package com.br.string;

import java.util.Scanner;

public class Level06 {
	public void problem01() {
		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0);
		int num = (int) ch;
		System.out.println(num);
	}

	public void problem02() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		int sum = 0;
		for(int i = 0; i < a; i++) {
			int num = str.charAt(i) - '0';
			sum += num;
		}
		System.out.println(sum);
	}

	public void problem03() {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int[] arr = new int[26];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		for(int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			if(arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void problem04() {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		for(int i = 0; i < num1; i++) {	// num1번 반복
			int num2 = sc.nextInt();	// 문자 num2번 반복
			String str = sc.next();	// line은 띄여쓰기까지 반복하므로
			for(int k = 0; k < str.length(); k++) {
				for(int j = 0; j < num2; j++) {
					System.out.print(str.charAt(k));
				}
			}
			System.out.println();
		}
	}
	
	public void problem05() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] arr = new int[26];
		for(int i = 0; i < 26; i++) {
			arr[i] = 0;
		}
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				arr[str.charAt(i) - 'A']++;
			}
			else {
				arr[str.charAt(i) - 'a']++;
			}
		}
		int max = -1;
		char ch = '?';
		for(int i = 0; i < 26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i + 65);
			}
			else if(arr[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}
	
	public void problem06() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = ' ';
		int count = 1;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		if(str.charAt(0) == ' ')
			count--;
		if(str.charAt(str.length() - 1) == ' ' )
			count--;
		System.out.println(count);
	}
	
	public void problem07() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		int d = 0;

		c = (a % 10) * 100 + ((a / 10) % 10) * 10 + (a / 100);
		d = (b % 10) * 100 + ((b / 10) % 10) * 10 + (b / 100);
		int max = Math.max(c, d);
		System.out.println(max);
	}
	
	public void problem08() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			switch(str.charAt(i)) {
			case 'A' : case 'B' : case 'C' : 
				count += 3;
				break;
			case 'D' : case 'E' : case 'F' : 
				count += 4;
				break;
			case 'G' : case 'H' : case 'I' :
				count += 5;
				break;
			case 'J' : case 'K' : case 'L' :
				count += 6;
				break;
			case 'M' : case 'N' : case 'O' : 
				count += 7;
				break;
			case 'P' : case 'Q' : case 'R' : case 'S' :  
				count += 8;
				break;
			case 'T' : case 'U' : case 'V' : 
				count += 9;
				break;
			case 'W' : case 'X' : case 'Y' : case 'Z' :  
				count += 10;
				break;
			}
		}
		System.out.println(count);
	}
	
	public void problem09() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch == 'c') {
				if(i < str.length() - 1) { // 끝에 c가 있을 경우 제외
					if(str.charAt(i + 1) == '=') {	// c=
						i++;
					}
					else if(str.charAt(i + 1) == '-') {	// c-
						i++;
					}
				}
			}
			
			else if(ch == 'd') {
				if(i < str.length() - 1) {	
					if(str.charAt(i + 1) == 'z') {
						if(i < str.length() - 2) {
							if(str.charAt(i + 2) == '=') {	// dz=
								i += 2;
							}
						}
					}
					else if(str.charAt(i + 1) == '-') {	// dz-
						i++;
					}
				}
			}
			
			else if(ch == 'l') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == 'j') {
						i++;
					}
				}
			}
			
			else if(ch == 'n') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == 'j') {
						i++;
					}
				}
			}
			
			else if(ch == 's') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == '=') {
						i++;
					}
				}
			}
			
			else if(ch == 'z') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == '=') {
						i++;
					}
				}
			}
			count++;
		}
		System.out.println(count);
		
	}

}
