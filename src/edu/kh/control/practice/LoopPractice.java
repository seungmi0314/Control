package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);
	
	
	public void practice1(){
		
		System.out.print("숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input < 1) {
			System.out.print("1 이상의 숫자를 입력해주세요");
		} else {for(int i = 1; i <= input; i++) {
			System.out.print(i);
		}
		}
	}
	
	public void practice2(){
		System.out.print("숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input <= 1) {
			System.out.print("1 이상의 숫자를 입력해주세요");
		} else {for(int i = input; i >= 1; i--) {
			System.out.print(i);
		}
			
		}
		
	}
	
	public void practice3(){
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		int sum = 0;		
		
		for(int i = 1; i <= input; i++) {
				sum += i;
			
		}System.out.println(sum);
		
	}
	
	
	public void practice4(){
		System.out.print("숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		
		if(1 > input) {
			System.out.print("1이상의 숫자를 입력해주세요");
		} else {
			System.out.println("숫자를 입력하세요 : ");
			int input1 = sc.nextInt();
			
			for(int i = input; i >= input; i++) {
				for(int j = input1; j <= input1; i++) {
			
				}
		}
			
		}
		
	}
	
	public void practice5(){
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		for(int dan = input; dan <= input; dan++){
			for(int su = 1; su <=9; su++){
				System.out.printf("%2d x %2d = %2d", dan, su, dan*su);
				System.out.println();
			}
		}
		
		
	}
	
	
	public void practice6() {
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		if(2 > input) {
			System.out.println("2~9사이의 숫자만 입력해주세요");
		}else {for(int dan = input; dan <= 9; dan++) {
					for(int su = 1; su <= 9; su++) {
						System.out.printf("%2d x %2d = %2d", dan, su, dan*su);
					}System.out.println();
		}
		}
	}
	
	public void practice7() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		
		for(int i = 1; i <= input; i++) {
			for(int j = 1; j <= i; j++ ) {
				System.out.print("*");
				
			}System.out.println("");
			
		}
		
	}
	
	public void practice8() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = input; i >= 1; i--) {
			for(int j = i; j >= 1; j--) {
				System.out.print("*");
			}System.out.println("");
		}
		
		
	}
	
	
	public void practice9() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		
		for(int i = 1; i <= input; i++) {
			for(int j = input; j > 0; j-- ) {
				//for(int)
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
				
			}System.out.println("");
	}
	}
	
	
	public void practice10() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int i = input; i >= 1; i--) {
			for(int j = i; j > 1; j--) {
				System.out.print("*");
				
			}System.out.println();
		}
		
		
	}
	
	public void practice11() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 0; i < input; i++) {
			for(int j = 0; j < input-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
	}
	
	public void practice12() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int j = 1; j <= input; j+=3) {
				System.out.print("*");
			}System.out.println();
		}
		}
		
		//?
		
		public void practice13() {	
			System.out.print("자연수 하나를 입력하세요 : ");
			int input = sc.nextInt();
			
			for(int i = 1; i <= input; i++) {
				System.out.print(i);
			
				if(input %2 == 0 || input %3 == 0) {
					System.out.print(" ");
				}
			}
			//?
		
		
	}
	
	
}//
