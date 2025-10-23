package looping2;

public class WhileLoopNested {
    public String getTriangle(int n) {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (i <= n) {
            for (int j = 1; j <= i; j++) {
                sb.append('*');
            }
            if (i < n) sb.append('\n');
            i++;
        }
        return sb.toString();
    }
}
