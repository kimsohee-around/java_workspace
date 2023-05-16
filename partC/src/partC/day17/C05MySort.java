package partC.day17;

import java.util.Arrays;

public class C05MySort {
	//가장 간단한 정렬 알고리즘 구현 해보기. 이 알고리즘의 이름은 선택 정렬 입니다.
	public static void main(String[] args) {
	
		//정렬 알고리즘(오름차순) 동작 : 비교와 교환
				int[] nums = {34, 77, 19, 56, 45, 9};
				
				for(int i = 0; i < nums.length-1; i++) {	//마지막 i = nums.length-2
					for(int k =i+1; k < nums.length; k++) {   //k는 i 보다 뒤에 있는 인덱스
						if(nums[i] > nums[k]) {		// 인덱스 i와 k 위치의 값을 *교환하기
							int temp = nums[i];
							nums[i] = nums[k];
							nums[k] = temp;
						}
					}
					System.out.println("중간 과정" + (i+1) + "단계 :" +Arrays.toString(nums));
				}
				//i=0 일때 	, k=1 ~ 5 까지  nums[i] > nums[k] 비교. 참이면 교환
				//i=1 		, k=2 ~ 5 까지
				//i=2		, k=3 ~ 5 까지
				//i=3		, k=4 ~ 5 까지
				//i=4		, k=5 ~ 5 까지
				
				System.out.println("최종 결과 :" +Arrays.toString(nums));
				
				String[] names = {"momo","nana","zuwi","cat","dog","kiwi"};
				//위와 같은 동일한 선택 정렬 알고리즘으로 names 배열을 정렬해보세요.
				//힌트: 문자열 비교 조건연산은 comparTo로 해야 합니다.
				for(int i = 0; i < names.length-1; i++) {	//마지막 i = nums.length-2
					for(int k =i+1; k < names.length; k++) {   //k는 i 보다 뒤에 있는 인덱스
						if(names[i].compareTo(names[k]) > 0) {		// 인덱스 i와 k 위치의 값을 *교환하기
							String temp = names[i];
							names[i] = names[k];
							names[k] = temp;
						}
					}
					System.out.println("중간 과정" + (i+1) + "단계 :" +Arrays.toString(names));
				}

	}

}
