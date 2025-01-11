package a1121.ex01_Calculator;

public class Calculator {

	public int plus(int a, int b) {
        int result = a + b;
        return result;
	}

    public int minus(int a, int b) {
        int result = a - b;
        return result;
    }

    public double multiple(double x, double y) {
        double result = x * y;
        return result;
    }

    public double division(double x, double y) {
        double result = x / y;
        return result;
    }

    public double remainder(double x, double y) {
        double result = x % y;
        return result;
    }

    public int sum(int[] arr) {
        int sum = 0;
        // for (int i = 0; i < arr.length; i++); {}
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public double avg(int[] arr) {
        int sum = sum(arr); // 위에있는 sum(arr)을 가져온거임.
        double avg = (double) sum / arr.length;
        return avg;
    }





}
