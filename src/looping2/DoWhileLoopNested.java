package looping2;

public class DoWhileLoopNested {
    public String getNumberTriangle(int n) {
        if (n <= 0) return "";
        StringBuilder sb = new StringBuilder();
        int i = 1;
        do {
            int j = 1;
            do {
                sb.append(j);
                j++;
            } while (j <= i);
            if (i < n) sb.append('\n');
            i++;
        } while (i <= n);
        return sb.toString();
    }
}
