package partA.day04;

public class A18ForInFor { 		//중첩된 for문 (이중 for문)
	
	public static void main(String[] args) {
		
		System.out.println("1) 중첩 for의 변수값 확인");
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++)		//변수 i로 제어(실행)
				System.out.println("i="+i + ",j=" + j + ",hola~!!");  //변수 i와 j로 제어(실행)
			System.out.println("------------ 변수 i에 대한 for end");  //변수 i에 의해 제어(실행)
		}
		System.out.println("2) line에 따라 별 갯수 1씩 늘리기");
		for(int line=0;line<5;line++) {			//5번 실행		//line=0,1,2,3,4  
			
			for(int count=0;count < line+1;count++)			//count= 0~ line
				System.out.print("*");
			
			System.out.println();  	//내용 출력없이 줄바꿈.
			
		}
		
	}

}
