package condition2;

public class NestedSwitch {
    public String getSelection(int category, int choice) {
        switch (category) {
            case 1: // Drinks
                switch (choice) {
                    case 1: return "1, You selected: Tea";
                    case 2: return "1, You selected: Coffee";
                    default: return "1, Invalid drink choice";
                }
            case 2: // Food
                switch (choice) {
                    case 1: return "2, You selected: Pizza";
                    case 2: return "2, You selected: Burger";
                    default: return "2, Invalid food choice";
                }
            default:
                return category + ", Invalid category";
        }
    }
}
