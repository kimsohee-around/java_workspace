package partC.day21.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//단어장의 기능을 정의한 인터페이스 사용하기 - 자바 단어장 클래스로 구현.
public class JavaVocaNote implements VocaNoteBook{

	
	@Override
	public void load(String path) {		//파일에서 단어들 불러오기
		File file = new File(path);
		Scanner fsc = null;
		try {
			fsc = new Scanner(file);
			while(fsc.hasNext()) {
				System.out.println(fsc.nextLine());
			}
			System.out.println("정상적으로 단어장 파일 읽어오기 끝!!");

		}catch (FileNotFoundException e) {
			System.out.println("파일로부터 읽어오기 - 입력 예외 : " + e.getMessage());
		}finally {
			if(fsc !=null) fsc.close();
		}
		
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void add(JavaVoca voca) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, JavaVoca> getVoca() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public List<JavaVoca> group(String group) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public void save(String path) {
		// TODO Auto-generated method stub
		
	}

}
