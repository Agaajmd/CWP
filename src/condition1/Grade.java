package condition1;

public class Grade {
    public String getGrade(int score) {
        String g;
        if (score >= 90) {
            g = "A";
        } else if (score >= 75) {
            g = "B";
        } else if (score >= 60) {
            g = "C";
        } else {
            g = "F";
        }
        return "Grade: " + g;
    }
}
