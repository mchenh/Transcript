package vust.transcript.com.data;

public class Course {
	private String semester = "-1";
	private String subject = "-1";
	private int subjectNo = -1;
	private String courseTitle = "-1";
	private int credit = -1;
	private int points = -1;
	private String studentID = "-1";
	
	public Course(String semester, String subject, int subjectNo, String courseTitle, int credit, int points, String studentID) {
		this.setSemester(semester);
		this.setSubject(subject);
		this.setSubjectNo(subjectNo);
		this.setCourseTitle(courseTitle);
		this.setCredit(credit);
		this.setPoints(points);
		this.setStudentID(studentID);
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getSubjectNo() {
		return subjectNo;
	}
	public void setSubjectNo(int subjectNo) {
		this.subjectNo = subjectNo;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
}
