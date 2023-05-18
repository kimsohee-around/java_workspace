package partC.day20;

import java.util.Arrays;
import java.util.StringTokenizer;

public class C10StringToScore {
	
	//문자열 1개를 토크나이저로 분리하여 Score 객체 만들기
	public static void main(String[] args) {
		String str = "모모:90/88/99";
		String[] temp = new String[4];   //순서대로 "모모","90","88","99" 저장해보세요.
		
		//Score 객체 생성 초기값을 필드 name : 모모, java : 90, python : 88, html : 99로
		// 만들어 보세요.
		
		//1)토크나이저 분리기호 정규식?
		StringTokenizer stk = new StringTokenizer(str,":/");
		int i=0;
		while(stk.hasMoreTokens()) {
			temp[i] = stk.nextToken();		//temp[i++] = stk.nextToken() 는 배열에 대입 후 증가(++)
			//i++;
			System.out.println("temp[" + i + "] = " + temp[i++]);
		}
		System.out.println("변환된 배열 => " + Arrays.toString(temp));
		
		//2)분리된 토큰을 객체의 필드로 주는 방법?
		//      문자열을 정수로 변환하는 것은 Integer.parseInt(문자열) 리턴값은 정수
		Score momo = new Score(temp[0],
							Integer.parseInt(temp[1]),		//java
							Integer.parseInt(temp[2]),		//python
							Integer.parseInt(temp[3]));		//html
		
		//3)생성된 객체의 필드 값 출력(toString)
		System.out.println("변환된 Score 객체 momo => " +momo);
		System.out.println("momo 평균 = " + momo.average() + ", 학점 = " + momo.getGrade());
	
		//아래 str 을 1)의 while 문과 2)3) 합쳐서 배열과 while 없이 해보세요.
		str ="쯔위:92/77/85";
		stk = new StringTokenizer(str,":/");
		Score zuwi = new Score(stk.nextToken(),
						Integer.parseInt(stk.nextToken()),
						Integer.parseInt(stk.nextToken()),
						Integer.parseInt(stk.nextToken())
					);
		
		System.out.println("변환된 Score 객체 zuwi => " +zuwi);
		System.out.println("momo 평균 = " + zuwi.average() + ", 학점 = " + zuwi.getGrade());
	}

}
