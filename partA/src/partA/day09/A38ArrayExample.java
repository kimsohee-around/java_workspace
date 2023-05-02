package partA.day09;

import java.util.Random;
import java.util.Scanner;

//배열 활용 예제 : 과제로 해온 예시 테스트
public class A38ArrayExample {

	
	public static void main(String[] args) {
		int[] scores = {67,45,90,83,77};
		//scores 배열에서 가장 큰값과 가장 작은 값을 구하기
		int max = scores[0];    //최대값 저장 변수 초기화
		int min = scores[0];	//최소값 저장 변수 초기화
		
		for(int i=1;i<scores.length;i++) {
			if(scores[i] > max) 
				max = scores[i];
			
			if(scores[i] < min)
				min = scores[i];
		}
		
		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);
		
		System.out.println("배열 변수로 출력 = " + scores);		//[I@515f550a
		//[I@객체의 참조값을 나타내는 16진수 8자리  , [I는 배열이고 다른 참조타입에서는 패키지명.클래스명입니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("참조타입 변수 sc 출력 = " + sc);		//.... 참고로 확인. 설명은 패스.
		Random rnd = new Random();
		System.out.println("참조타입 변수 rnd 출력 = " + rnd);  //java.util.Random@511baa65
		
		
		int sum=0;
		System.out.println("데이터를 여러 개 저장하는 자료구조에서 사용되는 향상된 for");
		max=scores[0];
		min=scores[0];
		for(int temp : scores) {    //scores 배열에서 인덱스 순서로 1개씩 값을 가져와 temp에 저장.
			System.out.println(temp);  //temp는 위의 for문에서 scores[i] 를 대신합니다.
			if(temp > max) max=temp;    
			if(temp < min) min=temp;
			
			sum+=temp;
		}
		System.out.println("합계 = " + sum);
		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);
	}
}
