package partB.day12;

import java.util.Scanner;

public class B05ScoreWhileTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//인스턴스 필드와 인스턴스 메소드는 객체를 생성해야 사용할 수 있습니다.
		boolean status= true;
		while(status) {
			Score score = new Score();
			
			System.out.print("이름을 입력하세요.(종료:end) >>>> ");
			String name = sc.nextLine();
			if(name.equals("end")) break;
			
			score.setName(name);
			System.out.print("국어 성적 입력 >>> ");
			score.setKorea(sc.nextInt());
			System.out.print("영어 성적 입력 >>> ");
			score.setEnglish(sc.nextInt());
			System.out.print("과학 성적 입력 >>> ");
			score.setScience(sc.nextInt());
			System.out.println("입력 값 = " + score.score());
			System.out.println("총점 = " + score.sum());
			System.out.println(String.format("평균 = %.2f\n", score.average()));
			sc.nextLine();		//마지막 남은 엔터 처리
		}
	}
}
