package contoh2;

public class ArrayMinMax {
    public int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[] { Integer.MAX_VALUE, Integer.MIN_VALUE };
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int v : arr) {
            if (v < min) min = v;
            if (v > max) max = v;
        }
        return new int[] { min, max };
    }
}
