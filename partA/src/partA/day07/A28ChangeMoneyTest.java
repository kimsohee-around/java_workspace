package partA.day07;

public class A28ChangeMoneyTest {
	
	public static void main(String[] args) {
		
		int won;
		double changeYen;
		double changeDollar;
		double oneYenWon = 1000.86/100;			//네이버환율 계산기 100엔을 기준으로 표시. 1엔 ? 원
		double oneDollarWon = 1338.5;			//               1달러를     " . 1달러 ? 원
		
		won = 1_000_000;			//여행 경비 예산 금액(원)
		//yen = (won / 9.84);			//원을 엔으로 계산 (1엔 9.84 원)
		//dollar = (won / 1323.38);
		
		System.out.println("========== 일본 여행 출국하기 전 ===========");
		changeYen = ChangeMoney.wonToYen(won, oneYenWon);
		System.out.println("*일본 여행의 환전 금액 = " + changeYen + " 엔 입니다.*");		// 101626 엔
		
		double useYen = 75000;			//사용한 금액
		int temp = (int)(changeYen-useYen);
		System.out.println("✈✈✈✈ 여행 입국 후 ✈✈✈✈");
		System.out.println("*여행에서 돌아왔습니다. 사용 경비는 "+ useYen+"엔 , 남은 금액을 원화로 환전하세요.*");
		System.out.println("*"+temp + "엔을 원화로 환전하면 " + ChangeMoney.yenToWon(temp, oneYenWon) + " 원 입니다.*");

		System.out.println("\n========== 미국 여행 출국하기 전 ===========");
		changeDollar = ChangeMoney.wonToDollar(won, oneDollarWon);
		System.out.println("미국 여행의 환전 금액 = " + changeDollar + " 엔 입니다.");		// 101626 엔
		
		double useDollar = 650;			//사용한 금액
		System.out.println("✈✈✈✈ 미국 여행 입국 후 ✈✈✈✈");
		System.out.println("여행에서 돌아왔습니다. 사용 경비는 "+ useDollar+"달러 , 남은 금액을 원화로 환전하세요.");
		temp = (int)(changeDollar-useDollar);
		System.out.println(temp + "달러를 원화로 환전하면 " + ChangeMoney.dollarToWon(temp, oneDollarWon) + " 원 입니다.");
		
	}

}
