package classLesson;

import java.util.ArrayList;



public class Student {
	private String studentId;
	private String fullStudName;
	private ArrayList<Course> courselst =new ArrayList<>();
	private ArrayList<Integer> gradeslst =new ArrayList<>();
	
	//c`tor
	public Student(String studentId, String fullStudName) {
		setStudentId(studentId);
		setFullStudName(fullStudName);
	}

	
	//setters and getters :
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getFullStudName() {
		return fullStudName;
	}

	public void setFullStudName(String fullStudName) {
		this.fullStudName = fullStudName;
	}

	public ArrayList<Course> getCourselst() {
		return courselst;
	}

	public void setCourselst(ArrayList<Course> courselst) {
		this.courselst = courselst;
	}

	public ArrayList<Integer> getGradeslst() {
		return gradeslst;
	}

	public void setGradeslst(ArrayList<Integer> gradeslst) {
		this.gradeslst = gradeslst;
	}
	
		//add course
	public void addCourse(Course course1) {
		if(!courselst.contains(course1)) {
		courselst.add(course1);
		gradeslst.add(-1);
		}
	}
	
		
	//remove course
	public void removeCourse(Course course1) {
		if(courselst.contains(course1)) {
		int x =courselst.indexOf(course1);
		courselst.remove(x);
		gradeslst.indexOf(x);
		}
	}
	
	//set grade
	public void setGrade(int index,int grade) {
		if(index<gradeslst.size()) {
		gradeslst.set(index, grade);
		}
	}
	
	
	//toString
	public String toString() {
		return "full student name is :"+getFullStudName()+" Id :"+getStudentId()+" the list of courses is:"+courselst.toString()+"list of grades :"+getGradeslst()+"\n";
	}
	
	//average function
	public double checkAvg() {
		double avg =0;
		for (int avgIs : gradeslst) {
			avg +=avgIs;
		}
		return (avg/gradeslst.size());
	}
	//check max function:
	public Course checkMax() {
		int index =0;
		int maxGrade =gradeslst.get(0);
		 for ( int i = 0; i < gradeslst.size(); i++ ) 
			 if(gradeslst.get(i) > maxGrade) {
				 maxGrade=gradeslst.get(i);
				 index =i; 
			 }
			 return courselst.get(index);
		 }
			 
			 
	
		
		 }
		
	
	
	
	
	
	


