package partC.day22.example;

import java.util.List;
import java.util.Scanner;



public class CustomerApp {
	
public static void main(String[] args) {
	CustomerNote myCustomer = new CustomerNote();
	
	Scanner sc = new Scanner(System.in);
	String name;
	String address;
	String grade;
	String sel;
	boolean run = true;
	String path = "D:\\iclass0419\\고객주소록.txt";
	myCustomer.load(path);
	
	System.out.println("선택 기능 👉  [s]이름찾기 [g]그룹선택 보기   [a]전체보기 [e]프로그램 끝내기");
	
	while (run) {
		System.out.print("선택 ✏ ->");
		sel = sc.nextLine();
		
		switch (sel) {
		

		case "n": 
			System.out.print("이름 입력 ✏ ");
			name = sc.nextLine(); 
			System.out.print("주소 입력 ✏ ");
			address = sc.nextLine();
			System.out.print("그룹(1:일반고객,2:직원,3:VIP ✏ ");					
			grade = sc.nextLine();
			//add()메소드 실행하기
			Customer c = new Customer(name, address, grade);   
			c.setGrade(grade);  //level 1,2,3 입력 받은 것을 해당 문자열로 변환하기
			myCustomer.add(c);
			break;
		case "g":
			System.out.print("그룹(1:일반고객,2:직원,3:VIP ✏ ");					
			grade = sc.nextLine();			//1,2,3 중 하나를 입력 
			List<Customer> results = myCustomer.group(grade);
			System.out.println("검색 결과 개수 ==>" +  results.size());
			System.out.println(results);
			break;
		case "a":
			//화면에 모두 출력 메소드 호출
			myCustomer.print();
			break;
		case "e":
			//프로그램이 종료될 때 , 단어장 파일을 갱신(update)하기 : Map에 저장된 데이터를 파일로 저장하기
			myCustomer.save(path);
			 System.out.println("새로운 정보가 이 파일에 저장되었습니다.");
			run=false;		//종료조건
			break;
	}

		
	}
}
}
