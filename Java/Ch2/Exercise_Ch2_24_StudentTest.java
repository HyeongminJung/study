package Ch2;

import java.util.ArrayList;

class Subject{
	private String subjectName;
	private int score;
	
	public Subject() {}
	public Subject(String subjectName, int score) {
		this.subjectName = subjectName;
		this.score = score;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
class Student{
	private int studentId;
	private String studentName;
	private ArrayList<Subject> studentScore;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		studentScore = new ArrayList<Subject>();
	}
	public void addSubject(String subjectName, int score) {
		this.studentScore.add(new Subject(subjectName, score)) ;
	}
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : studentScore) {
			System.out.println("학생 "+this.studentName+"의 "+
					s.getSubjectName()+"과목 성적은 "+
					s.getScore()+"입니다");
			total += s.getScore();
		}
		System.out.println("학생 "+this.studentName+"의 총점은 "
				+total+"입니다.");
	}
}
public class Exercise_Ch2_24_StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(1002, "Kim");
		
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		
		studentLee.showStudentInfo();
		System.out.println("======================================");
		studentKim.showStudentInfo();
	}

}
