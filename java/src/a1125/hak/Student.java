package a1125.hak;

public class Student {
    private String name;
    private int studentId;
    private int kor, math, eng;

    public Student() {};
  
    public Student(String name, int studentId, int kor, int math, int eng) {
        this.name = name;
        this.studentId = studentId;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getStudentId() {return studentId;}
    public void setStudentId(int studentId) {this.studentId = studentId;}
    public int getKor() {return kor;}
    public void setKor(int kor) {this.kor = kor;}
    public int getMath() {return math;}
    public void setMath(int math) {this.math = math;}
    public int getEng() {return eng;}
    public void setEng(int eng) {this.eng = eng;}

	public Double getAverage() {
        return (double) (kor + math + eng) / 3.0;
    }





















    
}
