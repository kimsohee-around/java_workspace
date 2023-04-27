package partA.day07;

public class ChangeMoney {
	
	
	public static double wonToYen(int won,double oneYenWon) {
		System.out.println("환전할 금액 = " + won +"￦, 1엔 환율 = " + oneYenWon + "￦");
		double temp = won/oneYenWon;
		return Math.round(temp*10)/10.0;
	}
	
	
	public static double wonToDollar(int won,double oneDollarWon) {
		System.out.println("환전할 금액 = " + won +"￦, 1달러 환율 = " + oneDollarWon + "￦");
		double temp = won/oneDollarWon;
		return Math.round(temp*10)/10.0;
	}
	//실행할때는 ChangeMoney.toOtherCurrency(1000000, 1333.33,"달러") //String 진도나가고 다시 합시다.
	public static double toOtherCurrency(int won, double otherRate, String unit) {
		System.out.println("환전할 금액 = " + won +"￦, 1"+unit +"환율 = " + otherRate + "￦");
		double temp = won/otherRate;
		return Math.round(temp*10)/10.0;
	}
	
	
	public static double yenToWon(int yen, double oneYenWon) {
		System.out.println("환전할 금액 = " + yen +"￥, 1엔 환율 = " + oneYenWon + "￦");
		double temp = yen*oneYenWon;
		return Math.round(temp*10)/10.0;
	}
	
	
	public static double dollarToWon(int dollar, double oneDollarWon) {
		System.out.println("환전할 금액 = " + dollar +"＄, 1엔 환율 = " + oneDollarWon + "￦");
		double temp = dollar*oneDollarWon;
		return Math.round(temp*10)/10.0;
	}

}
