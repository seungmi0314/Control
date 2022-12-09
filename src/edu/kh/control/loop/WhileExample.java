package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {

	/*while문
	 *  - 별도의 초기, 증감식이 존재하지 않고
	 *    반복 종료 조건을 자유롭게 설정하는 반복문
	 *    
	 *   뭔솔? - 확실히 언제 반복이 끝날지는 모르지만
	 *          언젠가 반복 조건이 false가 되는 경우 반복을 종료함
	 *          
	 *  내가 오늘 달리기 할건데 세번만 할거면 포문
	 *  지쳐 쓰러질때까지 달리기 할거면 와잉ㄹ문
	 *  
	 * [작성법]
	 * while(조건식){
	 * 			조건식이 true일 동안 반복 수행 될 구문
	 * }
	 *          
	 * */
	
	
	
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		while(input != 9) { //인풋이 9가 아닐때 반복
			System.out.println("======키오스크======");
			System.out.println("======메뉴 선택======");
			System.out.println("1. 떡볶이");
			System.out.println("2. 김밥");
			System.out.println("3. 쫄면");
			System.out.println("9. 종료");
			
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			
			switch(input) {
			case 1 : System.out.println("떡볶이 주문 완료!"); break;
			case 2 :System.out.println("김밥 주문 완료!"); break;
			case 3 : System.out.println("쫄면 주문 완료!"); break;
			case 9 : System.out.println("키오스크를 종료합니다."); break;
			default : System.out.println("잘못 입력했어요~!");
			}
			
			}
			
		
		
		}
	
	
	public void ex2() {
	//입력되는 모든 정수의 합 구하기
	//단, 0이 입력되면 반복 종료 후 결과 출력
		//-> 0이 입력 되지 않으면 계속 반복
	Scanner sc = new Scanner(System.in);
	int input = -1;
	int sum = 0;
	
	while(input != 0) {
		System.out.print("정수 입력 : ");
		input = sc.nextInt();
		
		sum += input; //입력받은 값을 sum에 누적
		
	}
	System.out.println("합계: " + sum);
	 // 0이 아닌 이상 사용자가 입력을 계속 할 수 있게 해야 함
	 // 따라서 와일문에 0이 들어가면 안됨
	 // 0이 들어가면 종료되기때문에 인풋에 0만 아니면 됨
	 // 인풋값을 계속 더해줄 변수가 필요함
	 // 썸은 무조건 0으로 시작해야 함
	 // 와일로 와서 정수를 입력 했을 때 예를 들어 1이라면
	 // 맨 밑에 0 + 1
	
	}

	
	
	public void ex3() { //시험 나올거같음
		// 1부터 입력한 값의 합
		// 단, 0을 초과한 숫자 입력
		//=> 0이하의 숫자를 입력 할 시 "1이상의 숫자를 입력해주세요" 문구 출력
		// ex) 입력값 : 5
		// => 1 + 2 + 3 + 4 + 5 = 출력해야하는 값
		// ex) 입력값 : 10
		//=> 1 + 2 + 3 .... +10 = 출력해야하는 값
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		int input = sc.nextInt();
		int sum = 0;
		
		if(input > 0) {
			int i = 1; //i가 인풋까지 달려야됏?
			
			while(i <= input) {
				sum += i;
				i++;
			}
			System.out.println("1부터" + input + "까지의 합은" + sum + "입니다.");
			
		} else {System.out.print("1이상의 숫자를 입력해주세요 : ");
			}
		
	}
	
	public void ex4() {
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		int sum = 0;
		
		// do ~ while문
		// -> 최소 한번은 수행하는 반복문
		do {
			System.out.print("정수 : ");
			input = sc.nextInt();
			
			sum += input;
			
		} while(input !=0);
		
		System.out.println("합계 : " + sum);
		 
		 
		//와일문 같은경우 키오스크에 사용
		//포문은 
		
	}
	
}//
