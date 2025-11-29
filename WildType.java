

public enum WildType {
    WILD(0),
    WILD_DRAW_FOUR(1);  

    private int type;

    WildType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

}
