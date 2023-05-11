package partB.day15;

public class B15AShapeTest {

	public static void main(String[] args) {
		//AShape aShape = new AShape();	 //오류:추상클래스는 객체 생성 못함.
		
		AShape otri = new OTriangle();
		System.out.println("============================");
		AShape ocir = new OCircle(16.5);
		System.out.println("============================");
		AShape oladder = new OLadderShape("모모사다라꼴", 11, 13, 23);
		System.out.println("============================");
		
		AShape[] shapes = new AShape[5];		//AShape 구현객체를 참조할 배열
		
		//위 3개 객체 참조값을 배열 요소에 저장하기.
		shapes[0] = otri;
		shapes[1] = ocir;
		shapes[2] = oladder;	
		shapes[3] = new OCircle(22);
		System.out.println("============================");
		shapes[4] = new OLadderShape("사나사다리꼴", 15, 22, 25);
		System.out.println("============================");
		
		otri.shapeName = "삼각형"; shapes[0].width = 20; shapes[0].height=16;
		System.out.println("AShape 배열에 저장된 도형 객체 출력(1)=====");
		for(int i=0;i<shapes.length;i++)
			System.out.println(shapes[i].toString());

		System.out.println("AShape 배열에 저장된 도형 객체 출력(2)=====");
		for(AShape s : shapes)  { // shapes 자료구조에서 순서대로 1개씩 가져와 변수 s에 참조
			//System.out.println(s.toString());
			System.out.println("넓이=" + s.area());
		}	
		
		
	}
}
