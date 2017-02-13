package vust.transcript.com.data;

public class Student {
	private String studentID = "-1";
	private String birthday = "-1";
	private String name = "-1";
	private String level = "-1";
	private String admissionDate = "-1";
	private String college = "-1";
	private String major = "-1";
	
	public Student(String studentID, String birthday, String name, String level, String admissionDate, String college, String major) {
		this.setStudentID(studentID);
		this.setBirthday(birthday);
		this.setName(name);
		this.setLevel(level);
		this.setAdmissionDate(admissionDate);
		this.setCollege(college);
		this.setMajor(major);
	}
	
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
}
