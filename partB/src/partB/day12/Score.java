package partB.day12;

//sum() , average() 메소드는 인스턴스 필드로 계산(처리)한 결과를 리턴하는 인스턴스 메소드
public class Score {
	
	private String name;
	private int korea;
	private int english;
	private int science;
	
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
