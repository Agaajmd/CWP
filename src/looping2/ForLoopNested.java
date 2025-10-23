package looping2;

public class ForLoopNested {
    public String getGrid(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                sb.append("Row ").append(i).append(" Col ").append(j);
                if (!(i == n && j == n)) sb.append('\n');
            }
        }
        return sb.toString();
    }
}
