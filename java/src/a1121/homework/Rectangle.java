package a1121.homework;

public class Rectangle {

    // 필드 선언
    int width = 0; // 초기값 0
    int height = 0; // 초기값 0


    // 생성자 선언

    Rectangle() {};

    Rectangle(int width) {
        this.width = width;
        this.height = width;
    };

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea(int i, int j) {
        return i * j;
    };

    public int getPerimeter(int i, int j) {
        return (i * 2) + (j * 2);
    };
}
