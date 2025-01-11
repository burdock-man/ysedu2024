package a1121.compute;

public class Computer {

    public int sum(int ... value) {
        
        int sum = 0;

        for(int i : value) {
            sum += i;
        }

        return sum;
    }

}
