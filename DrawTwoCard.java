public class DrawTwoCard  extends ActionCard {
    public DrawTwoCard(Color color) {
        super(color);
    }

    @Override
    public void applyAction() {
        // Logic to make the next player draw two cards
        System.out.println("Next player draws two cards!");
    }
    
}
