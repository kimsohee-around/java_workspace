package partC.day17.beable;

//인터페이스는 다른 인터페이스를 부모로 상속 받을 수 있습니다.
public interface Thinkable extends BeAble{
	
	void think();			//생각하다
	int calculate(int a, int b);	//계산하다.

}
