package a1122.homework;

class Student {

    // 필드
    private String name;
    private int id;
    private int koreanScore;
    private int englishScore;
    private int mathScore;
    private double average;
    private int number = 0;
    private static int totalStudent = 0;
    private static int totalKorean = 0;
    private static int totalEnglish = 0;
    private static int totalMath = 0;

    // 성적 누적 초기화 메서드
    public static void sTotalClear() {
        totalKorean = 0;
        totalEnglish = 0;
        totalMath = 0;
    }

    // 생성자
    public Student(String name, int koreanScore, int englishScore, int mathScore) {
        this.name = name;
        this.id = totalStudent + 20240001;
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
        ++totalStudent;
        number = totalStudent;
        average = (double) (koreanScore + englishScore + mathScore) / 3;

        if (koreanScore < 0) {
            System.out.println("*** 오류 : 점수는 0부터 100까지 적을 수 있습니다. 0점으로 처리됩니다. ***");
            this.koreanScore = 0;
        } else if (englishScore < 0) {
            System.out.println("*** 오류 : 점수는 0부터 100까지 적을 수 있습니다. 0점으로 처리됩니다. ***");
            this.englishScore = 0;
        } else if (mathScore < 0) {
            System.out.println("*** 오류 : 점수는 0부터 100까지 적을 수 있습니다. 0점으로 처리됩니다. ***");
            this.mathScore = 0;
        }
    }

    // 정보열람메서드 - 1
    public static void sInfo(Student[] i) {
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        System.out.println("|                                                                                                  |");
        System.out.println("| 학생 리스트                                                                                      |");

        sTotalClear();

        for (int j = 0; j < i.length; j++) {
            System.out.printf("| %d | 이름: %s | 학번: %d | 국어점수: %3d | 영어점수: %3d | 수학점수: %3d | 평균: %3.02f  |\n",
            i[j].number, i[j].name, i[j].id, i[j].koreanScore, i[j].englishScore, i[j].mathScore, i[j].average);
            totalKorean += i[j].koreanScore;
            totalEnglish += i[j].englishScore;
            totalMath += i[j].mathScore;
        }
    }

    // 정보열람메서드 - 2
    public static void sAvg() {
        System.out.println("|                                                                                                  |");
        System.out.println("| 전체 평균                                                                                        |");
        System.out.printf("| 전체 국어 평균: %3.02f | 전체 영어 평균: %3.02f | 전체 수학 평균: %3.02f  | 전체 전과목 평균: %3.02f |\n",
        (double) totalKorean / totalStudent, (double) totalEnglish / totalStudent, (double) totalMath / totalStudent, (double) (totalKorean + totalEnglish + totalMath) / (totalStudent * 3));
        System.out.println("|                                                                                                  |");
    }

    // 게터, 세터
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public int getKoreanScore() {return koreanScore;}
    public void setKoreanScore(int koreanScore) {this.koreanScore = koreanScore; updateAverage();}

    public int getEnglishScore() {return englishScore;}
    public void setEnglishScore(int englishScore) {this.englishScore = englishScore; updateAverage();}

    public int getMathScore() {return mathScore;}
    public void setMathScore(int mathScore) {this.mathScore = mathScore; updateAverage();}

    public int getNumber() {return number;}
    public double getAverage() {return average;}

    public static int getTotalKorean() {return totalKorean;}
    public static void setTotalKorean(int totalKorean) {Student.totalKorean = totalKorean;}

    public static int getTotalEnglish() {return totalEnglish;}
    public static void setTotalEnglish(int totalEnglish) {Student.totalEnglish = totalEnglish;}

    public static int getTotalMath() {return totalMath;}
    public static void setTotalMath(int totalMath) {Student.totalMath = totalMath;}

    public static int getTotalStudent() {return totalStudent;}
    
    public static void setTotalStudent(int totalStudent) {Student.totalStudent = totalStudent;}


    private void updateAverage() {
        this.average = (double) (this.koreanScore + this.englishScore + this.mathScore) / 3;
    }

    public static void updateTotalAverage(Student[] i) {

        sTotalClear();
    
        for (Student j : i) {
            totalKorean += j.getKoreanScore();
            totalEnglish += j.getEnglishScore();
            totalMath += j.getMathScore();
        }
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void resetNumbers(Student[] i) {
        for (int j = 0; j < i.length; j++) {
            i[j].setNumber(j + 1); // 학생 번호를 배열 순서대로 재할당
        }
    }

}
