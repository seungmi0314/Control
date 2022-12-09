package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {

	/*
	 * for문
	 * - 끝이 정해져 있는(횟수가 정해져 있는) 반복문
	 * - 조건에 따라 한번도 수행되지 않을 수 있음
	 * 
	 * [작성법]
	 * 
	 * for(초기식; 조건식; 증감식) {
	 * 		반복 수행할 코드
	 * }
	 * 
	 * - 초기식 : for문을 제어하는 용도의 변수 선언(for문 밖에서 사용 불가능)
	 * 
	 * - 조건식 : for문의 반복 여부를 지정하는 식 (다음 반복 진행 해? 라고 물어보는거)
	 * 			보통 초기식에 사용된 변수를 이용하여 조건식을 작성 함
	 * 
	 * - 증감식 : 초기식에 사용 된 변수를
	 * 			for문이 끝날 때 마다 증가 or 감소 시켜 조건식의 결과를 변하게 하는 식
	 * 
	 * */
	
	public void ex1() {
		//1~10 출력하기
		// -> 1부터 10까지 1씩 증가하며 출력
		//* 반복문은 조건식에 true 일 때만 반복

		//1)초기식	//2)조건식	//4)증감식
		for(int i = 1; i <=10; i++) {
					// i < 11 이것도 가능
			System.out.println("i :" + i);
			// 3) 반복 수행 될 코드
		}
		
		
	}
	
	public void ex2() {
		// 3에서 7까지 1씩 증가하며 출력
		// 3 4 5 6 7
		
		for(int i = 3; i <=7; i++) {
			System.out.println(i);
		}
		
	}
	
	public void ex3() {
		// 1부터 *입력받은 수*까지 1씩 증가하며 출력
		//*입력받은 수* : 스캐너 쓰라는 말
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			System.out.println("출력 : " + i);
		}
	}
	
	public void ex4() {
		//1.0부터 입력받은 실수 까지 0.5씩 증가하며 출력
		Scanner sc = new Scanner(System.in);
		System.out.print(" 입력 : ");
		double input = sc.nextDouble();
		
								// += :  i = i+0.5
		for(double i = 1.0; i <= input; i+=0.5) {
			System.out.println("출력 : " + i);
		}
		
	}
	
	public void ex5() {
		// 영어 알파벳 A부터 Z까지 한줄로 출력 -> println 말고 print로 출력
		// **char 자료형은? 유니코드
		// ABCDE...Z
	//1)	
		for(int i = 'A'; i <= 'Z'; i++) {
			//유니코드는 사실상 숫자라서 에러가 나지 않음
			System.out.print((char)i);
		}
		
	//2)	
		System.out.println("\n-----------------");
		
		for(char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}
		
	}	
	public void ex6() {
		//응용문제!
		//1부터 10까지 모든 정수의 합 구하기
		//=> 합계 : 55
		
		int sum = 0; // 반복되어 증가되는 i값의 합계를 저장 할 변수
					// 0으로 시작하는 이유 : 아무것도 더하지 않음으로
					//정확히 결과를 도출 할 수 있음
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
			//sum = sum + 1;
		}
		System.out.println("합계 : " + sum);
		
	}
		
	public void ex7() {
		//1부터 20까지 1씩 증가하면서 출력
		//단, 5의 배수에 ()를 붙여서 출력 ==> 조건
		//ex) 1 2 3 4 (5) 6 7 8 9 (10) 11...
		
		
		/*
		
		for(int i = 1; i <=20; i++) {
			System.out.print(i);
		}
			
		
		if(i % 5 == 0) {
			System.out.println("(num)");
		}*/
		
		for(int i = 1; i <=20; i++) {
			
			if(i % 5 == 0) {
				System.out.print("(" + i  + ")");
			} else { System.out.print(i + " ");
			}
		}
	}
	
	
	
	//****** 중첩 반복문 ******
	public void ex8() { 
		for(int dan = 2; dan <= 9; dan++) {  //2 ~9단 까지 차례대로 증가
			for(int su = 1; su <= 9; su++) { // 각 단에 곱해질 수 1~9까지 차례대로 증가
				System.out.printf("%2d x %2d = %2d", dan, su, dan*su);
			}
			System.out.println(); //줄바꿈
		}
	}

	public void ex9() { 
		for(int dan = 9; dan >=2; dan--) {
			for(int su = 1; su <= 9; su++) {
				System.out.printf("%2d x %2d = %2d", dan, su, dan*su);
			}
			System.out.println();
			
			// 궁금한거! 구구단 말고 어떤 상황에 사용할까
		}
		
	}
	public void ex10() { 
		//12345
		//12345
		//12345
		//12345
		//12345
		
		//54321
		//54321
		//54321
		//모르겠는디
		for(int a = 1; a <= 5; a++) { // 5바퀴 반복하는 for문
			for(int b = 1; b <= 5; b++) { //12345 한 줄 출력하는 for 문
			
			System.out.print(b);
				}System.out.println();
		}
		System.out.println();
		
		for(int a = 1; a <= 3; a++) {
			for(int b = 5; b >= 1; b--) {
				System.out.print(b);
			}System.out.println();
		}
	
	
	}
	
	public void ex11() {
		//1
		//12
		//123
		//1234
		//========
		//4321
		//321
		//21
		//1
		
	/*	for(int a = 1; a <= 4; a++) {
			for(int b = 4; b >= 1; b-- ) {
				System.out.print(b);
			}System.out.println();
		}
		System.out.println("=========");
		
		for(int a = 1; a <= 4; a++) {
			for(int b = 1; b <= 4; b++) {
				System.out.print(b);
			}System.out.println();
		}*/ 
		
		//======================================
		
		for(int x = 1; x<=4; x++){
			for(int i = 1; i <= x; i++) {
				System.out.print(i);
			}System.out.println();
		}
		System.out.println("=========");
		
		for(int x = 4; x >= 1; x--) {
			for(int i = x; i >= 1; i--) {
				System.out.print(i);
			}System.out.println();
		}
		
		//포문1 엑스는 4인 상태에서  조건식 4에 넣으면 트루
		//그래서 포문 2로 감 지금 i가 4래  포문2의 조건식도 트루 그래서 밑에 프린트에 4찍힌상태
		//그다음 증감식 가서 감소해서 3 조건식 검사 하러 옴 또 트루 그래서 밑에 3
		//이거 반복하다가 1찍히고 포문2의 조건식에서 폴스 나와서 포문1의 증감식에서 3 트루
		//이거 반복
	}

	
	
	
}
