package partC.day18;

import java.util.Comparator;
//비교자를 구현한 클래스 정의
//익명클래스와 비교하면 소스파일과 이름이 있습니다.
public class AscendingPointComparator
		implements Comparator<User> {

	@Override
	public int compare(User o1, User o2) {
		// TODO Auto-generated method stub
		return (int)(o1.getPoint()-o2.getPoint());
	}
}
