public class SkipCard extends ActionCard {
    public SkipCard(Color color) {
        super(color);
    }

    @Override
    public void applyAction() {
        // Logic to skip the next player's turn
        System.out.println("Next player's turn is skipped!");
    }
    
}
