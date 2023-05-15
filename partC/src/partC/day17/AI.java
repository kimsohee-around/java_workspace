package partC.day17;

public class AI implements Thinkable{
	
	protected char op;
	
	@Override
	public int calculate(int a, int b) {
		int result =0;
		switch (op) {
		case '+': 
			result=a+b;
			break;
		case '-': 
			result=a-b;
			break;
		case '*': 
			result=a*b;
			break;
		case '/': 
			result=a/b;
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + op);
		}
		return result;
	}
	
	@Override
	public void think() {
		System.out.println("학습된 정보를 수집해서 알려드립니다.");
		
	}
}
