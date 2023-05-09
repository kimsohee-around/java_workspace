package partB.day13;

//day12 Score 클래스로 생성자 동작 확인. 기본생성자 동작 여부를 day12의 Score클래스와 비교하는 것이 핵심.
public class Score {
	
	private String name;
	private int korea;
	private int english;
	private int science;
	
//매개변수가 있는 생성자를 만들었다면(오버로딩), 기본생성자 사용하고 싶을때 꼭 정의를 해야합니다.
// 이 Score 클래스는 기본 생성자로 객체를 생성할 수 없습니다.
	public Score(String name, int korea, int english, int science) {
		//this();			//오류:기본생성자가 없다.
		this.name = name;
		this.korea = korea;
		this.english = english;
		this.science = science;
	}

	//인스턴스 메소드로 만듭니다.
	public int sum() {
		return korea+english+science;
	}
	
	public double average() {
		return (double)sum()/3;
	}
	
	
	//getter
	public String getName() {
		return name;
	}
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getKorea() {
		return korea;
	}
	public void setKorea(int korea) {
		this.korea = korea;
	}
	
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	
    
	public String score() {
		/*
		 * return String.format("이름 : %s , 성적[국어:%d, 영어:%d , 과학:%d]\n",
		 * name,korea,english,science);
		 */
		return String.format("이름 : %s , 성적[국어:%d, 영어:%d , 과학:%d],총점: %d, 평균:%.2f\n", 
				name,korea,english,science,sum(),average());
	}
    
	
	

}
