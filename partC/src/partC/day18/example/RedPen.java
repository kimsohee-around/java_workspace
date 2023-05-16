package partC.day18.example;

import java.util.Random;

public class RedPen {
		private int n1;		//랜덤
		private int n2;		//랜덤
		private char op;     //  + , - , * , / 중 하나를 저장
		private boolean isCorrect;		//기본값 false. 정답여부
		
		//커스텀 생성자
		public RedPen(char op) {
			this.op = op;		//op 필드(연산자)만 초기화하는 생성자
		}
		
		public boolean isCorrect() {  		//isCorrect getter
			return isCorrect;
		}
		
		public void setCorrect(boolean isCorrect) {  //isCorrect setter
			this.isCorrect = isCorrect;
		}
		
		public void make() {		//n1,n2 필드값을 난수를 생성하여 저장합니다.
			
			Random r = new Random();		
		//새로운 난수 생성 클래스. r.nextInt(50); 이면 50보다 작은 정수로 난수를 리턴합니다. 
		
		//난수범위 n1은 min1~max1  , n2는 min2~max2  
			int max1=0,min1=0,max2=0,min2=0;
			
		//연산자에 따라 n1,n2 난수 범위를 다르게 합시다.(주석의 요구사항 참고)
			switch (op) {
			case '+':    //case 뒤에 정수,문자,문자열
				max1=99;min1=11;max2=99;min2=11;
				break;
			case '-':    //n1>n2 (뺄셈 결과값 양수가 나오도록 합니다.)  
				max1=99;min1=50;max2=39;min2=11;  
				break;
			case '*':   //n2 곱해지는 값의 크기를 작게 합니다.
				max1=77;min1=11;max2=11;min2=3;
				break;
			case '/':   //n1 나눠지는 값을 크게 , n2 값은 작게 합니다.
				max1=99;min1=50;max2=30;min2=11;
				break;	
			}	
			n1 = r.nextInt(max1-min1+1)+min1;		// n1은 min1~max1  범위의 난수
			n2 = r.nextInt(max2-min2+1)+min2;
		}
		
		public String problem() {		//문제를 문자열로 리턴.
			return n1 + " " + op + " " + n2 + " = ";
		}
		
		public int answer() {		//연산결과 정답값 int를 리턴
			int result=0;
			
			switch (op) {
			case '+':
				result = n1+n2;
				break;
			case '-':
				result = n1-n2;
				break;
			case '*':
				result = n1*n2;
				break;
			case '/':
				result = n1/n2;
				break;	
			default:
				throw new IllegalArgumentException("잘못된 연산자이므로 처리 못합니다.");
			}
			return result;
		}

		//출력 테스트를 위한 재정의
		@Override
		public String toString() {
			return "RedPen [n1=" + n1 + ", n2=" + n2 + ", op=" + op + 
					"] isCorrect=" + (isCorrect? "정답" :"오답") + "]";
		}
		
		
	}
