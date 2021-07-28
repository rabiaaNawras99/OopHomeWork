package classLesson;

public class Course {
	private String courseName;
	private int codeCourse;
	private int passGrade;
	
	// defualt c`tor
	public Course() {
		this.courseName="course demo ";
		this.codeCourse =0;
		this.passGrade=100;
	}
	
	//c`tor
	public Course(String courseName,int codeCourse,int passGrade) {
		setCodeCourse(codeCourse);
		setCourseName(courseName);
		setPassGrade(passGrade);
	}

	//setters and getters:
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCodeCourse() {
		return codeCourse;
	}

	public void setCodeCourse(int codeCourse) {
		this.codeCourse = codeCourse;
	}

	public int getPassGrade() {
		return passGrade;
	}

	public void setPassGrade(int passGrade) {
		if(passGrade>=0&&passGrade<=100)
		this.passGrade = passGrade;
	}
	
	public String toString() {
		return "The course Name is : "+getCourseName()+" code course is : "+getCodeCourse()+" the pass grade is :"+getPassGrade()+"\n";
	}
	
	
	
	
	
	

	
	

}
