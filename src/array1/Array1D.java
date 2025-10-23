package array1;

public class Array1D {
    public String getArrayInfo(int[] arr) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(' ');
        }
        sb.append('\n');
        sb.append("Sum: ").append(sum);
        return sb.toString();
    }
}
