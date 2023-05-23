package partC.day22.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class CustomerNote implements CustomerAddressBook { 

	private Map<String, Customer> customer;
	
	public CustomerNote() {
		customer = new TreeMap<>();
	}
	@Override
	public Map<String, Customer> getCustomer() {
		return customer;
	}

	@Override
	public void load(String path) {
		File file = new File(path);
		Scanner fsc = null;
		try {
			fsc = new Scanner(file);
			while(fsc.hasNext()) {
				String temp = fsc.nextLine();
				System.out.println(temp);
				StringTokenizer stk = new StringTokenizer(temp,"\t_()");
				String name =  stk.nextToken();
				customer.put(name, new Customer(name, stk.nextToken(), stk.nextToken()));
				
			}
			System.out.println("단어 " + customer.size() +" 개를 읽어와 저장했습니다.");
			System.out.println("정상적으로 파일 읽어오기 끝");
		} catch (FileNotFoundException e) {
			System.out.println("파일로부터 읽어오기 - 입력예외 : "+ e.getMessage());
		}finally {
			if(fsc != null) fsc.close();
		}
	}
	
	@Override
	public void print() {
		System.out.println(String.format("%-20s\t%-20s\t%-20s", "이름","주소","등급"));
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::");
		for(String key : customer.keySet()) {
			Customer cn = customer.get(key);
            System.out.println(String.format("%-20s\t%-20s\t%-20s",
            		cn.getName(),cn.getAddress(),cn.getGrade()));			
		}
	} 
	
	@Override
	public List<Customer> group(String level) {
		List<Customer> result = new ArrayList<>();
		level = switch(level) {
		case "1" -> "일반고객";
		case "2" -> "직원";
		case "3" -> "VIP";
		default -> throw new IllegalArgumentException("Unexpected (value = 1 or 2 or 3) :  " + level);
							//잘못된 인자값으로 발생되는 예외. 이런경우는 예외로 분류해서 처리하고 싶을 때 사용하면 됩니다.
		//default -> "";   //throw와 비교해 보세요.
		};
		
		for(String key : customer.keySet()) {
			Customer cm = customer.get(key);
			if(cm.getGrade().equals(level))
				result.add(cm);
		}
		return result;
	}


	@Override
	public void add(Customer cm) {
		customer.put(cm.getName(), cm);
	}


	@Override
	public void save(String path)  {
		File file = new File(path);
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(file);
			Iterator<String> iterator = customer.keySet().iterator();
			while (iterator.hasNext()) {
				String key = iterator.next();
				Customer cm = customer.get(key);
				pw.println(cm);   //cm.toString() 재정의한 문자열 리턴.(재정의 없다.했을때, 패키징명.클래스명@해시코드)
			}
			System.out.println("이름 "+customer.size() + "개를 파일에 저장하였습니다." );
			System.out.println("정상적으로 주소록 파일 저장하기 끝");
		} catch (FileNotFoundException e) {
			System.out.println("파일에 저장하기 - 출력 예외 : "+ e.getMessage());
			
		}finally {
			if(pw != null) pw.close();
		}

		
	}
	
}
