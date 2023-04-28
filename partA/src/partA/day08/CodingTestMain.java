package partA.day08;
//하나의 파일에 2개 이상의 클래스가 작성될 수 있습니다.
//단, public class 는 1개이고 파일명은 public class 의 이름으로 합니다
public class CodingTestMain {
	public static void main(String[] args) {
		//프로그래머스 문제의 메소드를 테스트 합니다.	
		System.out.println(Test.solution(10));
		System.out.println(Solution.solution(11));
		System.out.println(Solution.solution(20));
		System.out.println(Solution.solution(2200000));
	}
}

class Test {
    public static String solution(int num) {
    //코딩테스트 답 제출은 메소드 내용만 복붙하세요.	
        String answer = "test" + num;
        return answer;
    }
}
/*
 * 문제 설명
정수 num이 짝수일 경우 "Even"을 반환하고 
홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.

제한 조건
num은 int 범위의 정수입니다.
0은 짝수입니다.
입출력 예
num	return
3	"Odd"
4	"Even"
 * 
 */
class Solution {
    
    public static String solution(int num) {
        String answer = "";
        if(num % 2 == 0) answer="Even";
        else answer="Odd";
        return answer;
    }
}