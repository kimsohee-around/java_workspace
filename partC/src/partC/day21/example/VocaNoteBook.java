package partC.day21.example;

import java.util.List;
import java.util.Map;

//단어장에서 원하는 기능을 추상메소드로 선언 합니다.
public interface VocaNoteBook {
	
	Map<String, JavaVoca> getVoca();		//단어장 저장 Map 객체 가져오기
	void add(JavaVoca voca);		//단어장 항목 데이터를 Map에 추가
	public void print();			//단어장 Map 전체 데이터 출력 
	List<JavaVoca> group(String group);	//단어장 Map 에서 원하는 그룹(레벨)을 찾아서 List 로 리턴하기
	void load(String path);		//path로 지정된 경로파일에서 데이터 가져와 단어장 Map 에 저장하기
	void save(String path);		//path로 지정된 경로파일에 단어장 Map 데이터 저장하기
	JavaVoca remove(String key);		//key를 인자로 받아 단어장 Map 에서 데이터 제거. 삭제된 데이터 value 를 리턴.

}
