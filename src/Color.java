import java.util.EnumMap;

public enum Color  {
    NOCOLOR("No color"),
    RED("Red"),
    BLUE("Blue"),
    GREEN("Green");

    private final String label;

    Color(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
};
