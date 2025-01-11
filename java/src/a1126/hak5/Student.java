package a1126.hak5;

public class Student {

    private String name;
    private String studentId;
    
    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getStudentId() {return studentId;}

    public void setStudentId(String studentId) {this.studentId = studentId;}

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "이름: " + name + ", 학번: " + studentId;
    }

    
}
