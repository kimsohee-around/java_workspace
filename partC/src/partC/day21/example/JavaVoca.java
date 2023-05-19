package partC.day21.example;

public class JavaVoca {			//자바프로그래밍에 쓰이는 영어단어 1개의 뜻과 레벨을 저장(객체)할 클래스 정의 
	
	private String english;		 //영어 단어
	private String korean;		 //의미 ,뜻
	private String level;        //Beginner , Intermediate  , Advanced  중 하나의 문자열만 저장하기
						 //setLevel(String Level)은 인자로 "1","2","3"을 받아 그에 맞는 문자열로 필드값 저장하기
	@Override
	public String toString() {
		return english + "\t" + korean + "_" + level ;		//이 문자열이 파일에 저장되는 형태
	}
	
	public JavaVoca(String english, String korean, String level) {
							this.english = english;
							this.korean = korean;
							this.level = level;
	}
	//getter, setter 정의
	public void setLevel(String level) {  //사용자는 메뉴 선택 1,2,3 선택하고 그 값에 따라 level 문자열을 새로 정하기
		this.level = switch(level) {		//자바 12부터 가능
			case "1" -> "Beginner";
			case "2" -> "Intermediate";
			case "3" -> "Advanced";
			default -> throw new IllegalArgumentException("Unexpected (value = 1 or 2 or 3) :  " + level);
		};
	}
	
	public String getEnglish() {
		return english;
	}

	public String getKorean() {
		return korean;
	}

	public String getLevel() {
		return level;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public void setKorean(String korean) {
		this.korean = korean;
	}

}
