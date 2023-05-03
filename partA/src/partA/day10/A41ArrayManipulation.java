package partA.day10;

import java.util.Arrays;

//배열 조작 - 배열 요소 중간에 삽입/삭제
public class A41ArrayManipulation {

	public static void main(String[] args) {
		
		//추가 : 맨 뒤에 넣기 , **삽입 : 순서가 있을 때 중간에 넣기
		int[] numbers = {56,45,77,34,89,23,90};
		
		//주어진 인덱스 위치에 주어진 정수값을 저장하고 , 그 이후에 값들은 뒤로 밀기
		//예시 : 인덱스 3 , 값 999  , 결과는 56,45,77,999,34,89,23
		int k= 3;   int value =999;
		for(int i=numbers.length-1;i>3;i--) {		//length=7
				numbers[i]=numbers[i-1];
		}
		/*
		 * numbers[6] = numbers[5];   결과 numbers[6]은 23
		 * numbers[5] = numbers[4];   결과 numbers[5]은 89
		 * numbers[4] = numbers[3];   결과 numbers[4]은 34
		 * 
		 */
		
		numbers[k] = value;
		System.out.println(Arrays.toString(numbers));
		
		//주어진 인덱스 위치의 값을 제거하고 , 그 이후에 값들은 앞으로 땡기기
		// 현재 상태 : 56,45,77,999,34,89,23
		//		예시: 인덱스 2 , 결과는 56,45,999,34,89,23,0 
		k=2;
		for(int i=k;i<numbers.length-1;i++) {
			numbers[i] = numbers[i+1];
		}
		numbers[numbers.length-1]=0;
		System.out.println(Arrays.toString(numbers));

		/*
		 * numbers[2]=numbers[3];	결과 numbers[2]=999;
		 * numbers[3]=numbers[4];	결과 numbers[3]=34;
		 * numbers[4]=numbers[5];	결과 numbers[4]=89;
		 * numbers[5]=numbers[6];	결과 numbers[5]=23;
		 * 
		 * 수식을 numbers[i] = numbers[i+1] 로 했을 때
		 * i 의 범위는 2부터 numbers.length-2 까지
		 * 
		 * numbers[numbers.length-1]=0;
		 */
	}
	
}
