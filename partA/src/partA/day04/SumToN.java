package partA.day04;

import java.util.Scanner;

// 과제 : 1 ~ n까지의 합계를 for문으로 구해보세요. (n은 사용자가 입력합니다.)
public class SumToN {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, n;
		int total = 0;
		
		System.out.print("한계 값을 정하시오 : ");
		n = sc.nextInt();
		
		for(i = 1; i <= n; i++) {
			total += i; 
		}
		System.out.println("1 ~ " + n + "까지의 합계 : " + total);	
		
		sc.close();
		
	}
}
