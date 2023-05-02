package partA.day09;

import java.util.Arrays;

//배열 기본
public class A34ArrayBasic {
	
	public static void main(String[] args) {
		
		//변수 선언은 저장할 데이터의 형식과 이름을 정의. 변수선언 1개당 1개의 메모리 할당.
		
		//배열 선언은 저장할 데이터의 형식, 이름 과 데이터의 개수(할당 받는 메모리 크기)
		int[] arr1 = {34,56,78,89,65};		//저장할 값 초기화와 크기 결정(4바이트 x 5 = 20바이트 할당)
											//인덱스는 0부터 4
		
		int[] arr2 = new int[10];			//초기값은 기본값 0 , 정수 10개 (40바이트 할당), 인덱스 0~9
		
		//배열의 주요 속성 : length 는 배열의 길이(개수)를 갖습니다.
		System.out.println("==인덱스 직접 지정해서 배열 요소값 출력하기 ==");
		System.out.println("i=0, arr1[0]=" + arr1[0]);
		System.out.println("i=1, arr1[1]=" + arr1[1]);
		System.out.println("i=2, arr1[2]=" + arr1[2]);
		System.out.println("i=3, arr1[3]=" + arr1[3]);
		System.out.println("i=4, arr1[3]=" + arr1[4]);
		
		//배열에 저장된 값은 성적,포인트,이름 등등 같은 의미를 갖는 데이터가 저장되고
		// 처리 해야할 동작도 같습니다. => 반복문 필수
		int sum = 0;			//배열 활용 1 : 배열요소의 값 합계
		int count =0;
		System.out.println("==반복문으로 배열 요소값 출력하기 ==");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(String.format("i=%d, arr1[%d] = %d\n", i,i,arr1[i]));
			sum +=arr1[i];
			
			//배열 활용 2: 배열 요소 중 70 이상인 값의 개수
			if(arr1[i] >= 70) count++;
		}
		
		System.out.println("arr1 배열의 합계 =" + sum);
		System.out.println("arr1 배열의 70이상 값 개수 =" + count);
		
		//배열 요소값을 저장하기
		System.out.println("\narr2배열에 값 입력하기");
		arr2[0]=11;			//변수의 대입문 형식이고 단, 인덱스 필요.
		arr2[5]=55;
		
		//double d = Math.random()*45+1;
		//int rnd =(int)d;
		System.out.println("\n10개의 난수 생성하여 배열 저장하기");
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = (int)(Math.random()*45+1);
			System.out.print(arr2[i] + "\t");
			if(i==4) System.out.println();		//1줄에 5개 출력
		}
		
		
		//Arrays 클래스에는 배열과 관련 static 메소드 있습니다.
		System.out.println("== Arrays 클래스 메소드 연습 ==");
		System.out.println("배열요소의 값을 for문 없이 출력");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println("배열요소의 값을 순서대로 나열(정렬:sort)");
		Arrays.sort(arr1);		//정렬한 결과 arr1 배열은 인덱스의 값들 변경
		System.out.println(Arrays.toString(arr1));
		Arrays.sort(arr2);		//정렬한 결과 arr2 배열은 인덱스의 값들 변경
		System.out.println(Arrays.toString(arr2));
		
		
		
		
	}
}
