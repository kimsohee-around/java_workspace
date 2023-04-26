package partA.day04;

import java.util.Scanner;

// 과제 : 1 ~ n까지의 합계를 for문으로 구해보세요. (n은 사용자가 입력합니다.)
//		 start~end 까지의 합계로 업데이트 완료.
public class SumFromNToM {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int start,end;
		int total = 0;
		
		System.out.println("start 부터 end 까지 합계를 구합니다.");
		System.out.print("시작값 start 를 정하시오 : ");
		start = sc.nextInt();
		System.out.print("마지막값 end 를 정하시오 : ");
		end = sc.nextInt();
		
		for(int i = start; i <= end; i++) {
			total += i; 
		}
		
		System.out.println(start + " ~ " + end + "까지의 합계 : " + total);	
		sc.close();
	}
}
