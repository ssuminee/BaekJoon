package com.br.array;

import java.util.Scanner;
import java.util.Arrays;

public class Level04 {
	public void problem1() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] iArr = new int[num];

		for(int i = 0; i < num; i++) {
			iArr[i] = sc.nextInt();
		}

		Arrays.sort(iArr);
		//Arrays.sort() : 배열에 저장된 원소 값을 오름차순으로 정렬해주는 것

		System.out.println(iArr[0] + " " + iArr[iArr.length - 1]);
	}

	public void problem2() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		int index = 0;
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			count++;
			if(arr[i] > max) {
				index = count;
				max = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(index);
	}

	public void problem3() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String mul = Integer.toString(a * b * c);
		for(int i = 0; i < 10; i++) {
			int count = 0;
			for(int j = 0; j < mul.length(); j++) {
				if((int)(mul.charAt(j) - '0') == i) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

	public void problem4() {
		Scanner sc = new Scanner(System.in);
		int[] div = new int[10];
		for(int i = 0; i < 10; i++) {
			div[i] = sc.nextInt() % 42;
		}
		int count = 0;
		int temp;
		for(int i = 0; i < 10; i++) {
			temp = 0;
			for(int j = i + 1; j < 10; j++) {
				if(div[i] == div[j]) {
					temp++;
				}
			}
			if(temp == 0) {
				count++;
			}

		}
		System.out.println(count);
	}
	
	public void problem5() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		int max = 0;
		for(int i = 0; i < num; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		double sum = 0.0;
		for(double a : arr) {
			a = (a / max) * 100;
			sum += a;
		}
		System.out.println(sum / num);
	}
	
	public void problem6() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[num];
		for(int i = 0; i < num; i++ ) {
			arr[i] = sc.nextLine();
		}
		for(int i = 0; i < num; i++) {
			int score = 0;
			int count = 0;
			for(int j = 0; j < arr[i].length(); j++) {
				
				if(arr[i].charAt(j) == 'O') {
					count++;
				}
				else {
					count = 0;
				}
				score += count;
			}
			System.out.println(score);
		}
	}
	
	public void problem7() {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		for(int i = 0; i < num1; i++) {	// num1번 반복
			int num2 = sc.nextInt();
			int sum = 0;
			double count = 0.000;
			int[] arr = new int[num2];
			for(int j = 0; j < num2; j++) {	// 학생수
				arr[j] = sc.nextInt();
			}
			for(int j = 0; j < num2; j++) {
				sum += arr[j];
			}
			double avg = sum / num2;
			for(int j = 0; j < num2; j++) {
				if(arr[j] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", ((count / num2)) * 100.0);
		} // num1
		
	}








}
