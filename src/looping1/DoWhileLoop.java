package looping1;

public class DoWhileLoop {
    public int getOddNumbersAndSum(int max) {
        if (max <= 0) return 0;
        int sum = 0;
        int i = 1;
        do {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        } while (i <= max);
        return sum;
    }
}
