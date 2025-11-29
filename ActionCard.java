public abstract class ActionCard extends Card implements Actionable {
    public ActionCard(Color color){
        super(color);
    }

    // matches if same color , same type , or wild card
    @Override
    public boolean matches(Card other) {
        if (other == null) return false;
        if (other instanceof WildCard) return true;

        // match by color only
        return this.color == other.getColor();
    }
}
