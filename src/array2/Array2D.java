package array2;

public class Array2D {
    public String getMatrixInfo(int[][] matrix) {
        int rows = matrix.length;
        int cols = rows == 0 ? 0 : matrix[0].length;
        int total = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            sb.append("Row ").append(i + 1).append(": ");
            for (int j = 0; j < cols; j++) {
                int v = matrix[i][j];
                total += v;
                sb.append(v).append((v % 2 == 0) ? 'E' : 'O').append(' ');
            }
            sb.append('\n');
        }
        sb.append("Total: ").append(total).append('\n');
        int count = rows * cols;
        double avg = count == 0 ? 0.0 : (double) total / count;
        sb.append("Average: ").append(avg);
        return sb.toString();
    }
}
