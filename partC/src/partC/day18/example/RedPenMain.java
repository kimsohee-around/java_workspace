package partC.day18.example;

import java.util.Scanner;

import partC.day18.example.RedPen;

public class RedPenMain {
	
	public static void main(String[] args) {
		
		int count = 0;
		
		System.out.println("초등학교 2학년을 위한 2자리 사칙연산 문제 프로그램 빨간펜 입니다.");
		System.out.println("-------------------------");
		
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("-------------------------");
		
		System.out.println("시작합니다.");
		
		RedPen[] rp = new RedPen[5];
		Scanner sc = new Scanner(System.in);
		
//		rp[0] = new RedPen('*');
//		rp[1] = new RedPen('/');
//		rp[2] = new RedPen('-');
//		rp[3] = new RedPen('+');
//		rp[4] = new RedPen('+');
		
		for(int i = 0; i < rp.length; i++) {
			rp[i]=new RedPen('+');
			rp[i].make();
			System.out.print(String.format("문제%d. %s 답 입력 => ", 
					i + 1, rp[i].problem()));
			System.out.print("");
			int a = sc.nextInt();
			if(a == rp[i].answer()) {
				rp[i].setCorrect(true);	// 값이 맞을 때 i 번째 값을 true로 설정
				count++;
			}
		}

		System.out.println("-------------------------");
		System.out.println(String.format("채점합니다. 맞은 갯수 %d(%d 점)", count, count * 10));
		
		System.out.println("::: 틀린 문제 정답보기 :::");
		
		for(int i = 0; i < rp.length; i++) {
			if(!rp[i].isCorrect()) {	// 만약 true(a == rp[i].answer()) 가 아니라면 실행
				System.out.println(String.format("문제%d. %s %d ", 
						i + 1, rp[i].problem(), rp[i].answer()));
			}
		}
	}
}
