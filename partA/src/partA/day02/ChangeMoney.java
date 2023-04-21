package partA.day02;


/* ChangeMoney.java - 작성자 : 박현성
 여행을 가려면 환전을 해야합니다.
 활용 : 변수, 연산, 캐스팅(수업내용 범위 안에서 하세요.)
 일본 : 원화 -> 엔화
 미국 : 원화 -> 달러화
  
 1엔 = ?원
 1달러 = ?원
 
 여행에서 돌아왔습니다. 남은 돈은 원화로 얼마인가요.
 엔화 -> 원화, 달러화 -> 원화
 */
public class ChangeMoney {

	public static void main(String[] args) {
		
		int won;			
		int yen;
		int us;
		
		double wonyenRate; //원화에서 엔화로 바꿀 경우
		double wonyen;		//변경된 엔화 값
		double yenwonRate;; //엔화에서 원화로 바꿀 경우
		double yenwon;		//변경된 원화 값

		double wonusRate; //원화에서 달러로 바꿀 경우
		double wonus;
		double uswonRate; // 원화에서 달러로 바꿀 경우
		double uswon;
		
		won = 100000;
		yen = 5000;
		us = 50;
		wonyenRate = 0.1015;		//1원 ? 엔
		yenwonRate = 9.84;			//1엔 ? 원
		wonyen = (double)won * wonyenRate;
		yenwon = (wonyen - yen) * yenwonRate;

		wonusRate = 0.000755;
		uswonRate = 1322.5;
		wonus = (double)won * wonusRate;
		uswon = (wonus - us) * uswonRate;

		//한국 일본 환전 계산
		System.out.println("::: 한/일 23.04.20 기준 환율 :::");
		System.out.println("1원 = " + wonyenRate + '엔');
		System.out.println("1엔 = " + yenwonRate + '원');
		System.out.println("");
		
		System.out.println("::: 원화를 엔화로 환전할 경우 :::");
		System.out.println("환전할 원화는 얼마인가요? " + won + '원');
		System.out.println("원화를 엔화로 바꿀 때 : " + wonyen + '엔' );
		System.out.println("");
		
		System.out.println("::: 엔화를 원화로 환전할 경우 :::");
		System.out.println("일본에서 사용한 금액은 얼마인가요? " + yen + '엔');
		System.out.println("남은 엔화는 얼마인가요? " + (wonyen - yen) + '엔');
		System.out.println("엔화를 원화로 바꿀 때 : " + yenwon + '원');
		System.out.println("");
		
		
		//한국 미국 환전 계산
		System.out.println("::: 한/미 23.04.20 기준 환율 :::");
		System.out.println("1원 = " + wonusRate + "달러");
		System.out.println("1달러 = " + uswonRate + '원');
		System.out.println("");
		
		System.out.println("::: 원화를 달러로 환전할 경우 :::");
		System.out.println("환전할 원화는 얼마인가요? " + won + '원');
		System.out.println("원화를 달러로 바꿀 때 : " + wonus + "달러");
		System.out.println("");
		
		System.out.println("::: 달러를 원화로 환전할 경우 :::");
		System.out.println("미국에서 사용한 금액은 얼마인가요? " + us + "달러");
		System.out.println("남은 달러는 얼마인가요? " + (wonus - us) + "달러");
		System.out.println("달러를 원화로 바꿀 때 : " + uswon + '원');
		System.out.println("");
	}
}
