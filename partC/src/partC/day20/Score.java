package partC.day20;

public class Score {
	private final String name;
	private final int java;
	private final int python;
	private final int html;
	private char grade;		//꼭 필요한 필드는 아닙니다. getGrade()로 충분합니다.
	
	public Score(String name, int java, int python, int html) {
		this.name=name;
		this.java = java;
		this.python=python;
		this.html= html;
	}
	
	public int sum() {		return java+python+html;   	}
	public double average() {     return (double)sum() /3;   }
	
	public char getGrade() {
		if(average() >=90) this.grade='A';
		else if(average() >=80) this.grade='B';
		else if(average() >=70) this.grade='C';
		else this.grade='D';
		return this.grade;
	}

	@Override
	public String toString() {
		return "Score [이름=" + name + ", java=" + java + ", python=" + python + 
				", html=" + html + ", 학점=" + (grade=='\0'? getGrade():grade) + "]";
	}
	
	//(grade==' '? getGrade():grade)
	
}
