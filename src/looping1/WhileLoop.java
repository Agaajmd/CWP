package looping1;

public class WhileLoop {
    public int getEvenNumbersAndSum(int max) {
        int sum = 0;
        int i = 2;
        while (i <= max) {
            sum += i;
            i += 2;
        }
        return sum;
    }
}
