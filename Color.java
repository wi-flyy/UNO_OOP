// we assign our colors integer values 
// black = 0
// red = 1
// green = 2
// blue = 3
// yellow = 4


public enum Color {
    BLACK(0),
    RED(1),
    GREEN(2),
    BLUE(3),
    YELLOW(4);

    private int value;

    Color(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}