public class NumberCard extends Card {

    private int value; // from 0 to 9

    public NumberCard(Color color, int value) {
        super(color);
        this.value = value;

        // we gotta add a check hna 
    }


    public int getValue() {
        return value;
    }

    @Override
    public boolean matches(Card other) {
        if (other == null) return false;
        if (other instanceof WildCard) return true; // wild always matches
        if (other instanceof NumberCard) {

            // casting , treat other as a number card object
            NumberCard n = (NumberCard) other;
            return this.color == n.color || this.value == n.value;
        }
        // other is an action card: match if same color
        return this.color == other.getColor();
    }


    
}
