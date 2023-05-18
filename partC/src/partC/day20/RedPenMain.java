package partC.day20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import partC.day18.example.RedPen;

public class RedPenMain {
	//day18 예제에서 배열 사용을 ArrayList 로 바꾸겠습니다.
	public static void main(String[] args) {
		
		int count = 0;
		System.out.println("초등학교 2학년을 위한 2자리 사칙연산 문제 프로그램 빨간펜 입니다.");
		System.out.println("-------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("-------------------------");
		System.out.println("시작합니다.");
		
		RedPen[] rp = new RedPen[5];
		//앞으로 List 선언은 인터페이스 타입으로 합니다.
		List<RedPen> probs = new ArrayList<>();   //업캐스팅	. 이 객체는 List 에 정의된 메소드만 실행 가능.
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < rp.length; i++) {
			//rp[i]=new RedPen('+');
			probs.add(new RedPen('+'));
			//rp[i].make();
			probs.get(i).make();
			System.out.print(String.format("문제%d. %s 답 입력 => ", 
					i + 1, probs.get(i).problem()));
			
			int a = sc.nextInt();
			if(a == probs.get(i).answer()) {
				probs.get(i).setCorrect(true);	// 값이 맞을 때 i 번째 값을 true로 설정
				count++;
			}
		}

		System.out.println("-------------------------");
		System.out.println(String.format("채점합니다. 맞은 갯수 %d(%d 점)", count, count * 10));
		
		System.out.println("::: 틀린 문제 정답보기 :::");
		
		for(int i = 0; i < probs.size(); i++) {
			if(!probs.get(i).isCorrect()) {	// 만약 true(a == probs.get(i).answer()) 가 아니라면 실행
				System.out.println(String.format("문제%d. %s %d ", 
						i + 1, probs.get(i).problem(), probs.get(i).answer()));
			}
		}
	}
}
