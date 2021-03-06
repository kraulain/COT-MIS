package cot.entities;
// Generated Mar 5, 2016 8:17:52 PM by Hibernate Tools 4.3.1



/**
 * CourseSession generated by hbm2java
 */
public class CourseSession  implements java.io.Serializable {


     private Integer id;
     private Course course;
     private Instructor instructor;
     private Student studentByDelegate1;
     private Student studentByDelegate2;
     private String semester;

    public CourseSession() {
    }

	
    public CourseSession(Course course, Instructor instructor, String semester) {
        this.course = course;
        this.instructor = instructor;
        this.semester = semester;
    }
    public CourseSession(Course course, Instructor instructor, Student studentByDelegate1, Student studentByDelegate2, String semester) {
       this.course = course;
       this.instructor = instructor;
       this.studentByDelegate1 = studentByDelegate1;
       this.studentByDelegate2 = studentByDelegate2;
       this.semester = semester;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Course getCourse() {
        return this.course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }
    public Instructor getInstructor() {
        return this.instructor;
    }
    
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
    public Student getStudentByDelegate1() {
        return this.studentByDelegate1;
    }
    
    public void setStudentByDelegate1(Student studentByDelegate1) {
        this.studentByDelegate1 = studentByDelegate1;
    }
    public Student getStudentByDelegate2() {
        return this.studentByDelegate2;
    }
    
    public void setStudentByDelegate2(Student studentByDelegate2) {
        this.studentByDelegate2 = studentByDelegate2;
    }
    public String getSemester() {
        return this.semester;
    }
    
    public void setSemester(String semester) {
        this.semester = semester;
    }




}


