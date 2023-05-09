package partB.day13;

public class B09UserTest {
	
	public static void main(String[] args) {
		
		User momo = 
			new User("twice","김모모", 26, 100);
		
		System.out.println(momo.user());
		System.out.println("아이디="+momo.getId());
		System.out.println("이름="+ momo.getName());
		System.out.println("나이=" + momo.getAge());
		System.out.println("포인트=" + momo.getPoint());
		
		momo.setPoint(11000);
		System.out.println("포인트=" + momo.getPoint());
		
	}
}
