package partA.day11;
//실행시간을 확인하는 예시 : 로또 숫자 만들기 변형해서 테스트.
// 시간 단위 시,분,초 , ms(1000분의1초,10의-3승) ,us(100만분의 1초,10의 -6승),ns(10억분의 1초,10의-9승)  
public class LottoNumberss {
	
	
	public static void main(String[] args) {
		//1~n 사이의 난수를 중복없이 만들어서 배열에 저장하려면
		//		배열의 크기도 변수도 설정합니다. 1~n 까지 중복없이 임의로 만들어서 저장시키기
		int n = 45;
		int[] lottoNumbers = new int[n];
		int i=0;
		boolean status=false;
		
		System.out.println("currentTimeMillis : 1970년 1월 1일 0시 기준으로 카운트한 시간입니다. (long) ");
		System.out.println("현재 시간 : " + System.currentTimeMillis() +"ms");  //밀리
		System.out.println("nanoTime : Java 가상 머신이 사용하는 시간으로 시스템의 시간과는 상관 없습니다.");
		System.out.println("현재 시간 : " + System.nanoTime() +"ns");			//나노
		System.out.println("현재 시간 : " + System.nanoTime()/1000000.0 +"ms");			//밀리
		//코드의 실행시간을 측정할때는 nanoTime 사용합니다.
		
		long start = System.nanoTime();
		
		while(i !=n) {
			int temp = (int)(Math.random()*n +1);
			
			int j=0;
			for(j=0;j<i;j++) {
				status = lottoNumbers[j]==temp;
				if(status) {
					System.out.println("*배열에 있는 값 : "+temp);
					break;
				}
			}
			if(!status) {
				lottoNumbers[i]=temp;
				System.out.println(String.format("lotto[%d] = %d", i,lottoNumbers[i]));
				i++;
			}
		}
		
		long end = System.nanoTime();
		System.out.println("실행 시간 = " + (end-start) + "ns");
	}
}
