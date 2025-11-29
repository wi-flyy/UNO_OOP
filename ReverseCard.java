public class ReverseCard extends ActionCard {
    public ReverseCard(Color color) {
        super(color);
    }

    @Override
    public void applyAction() {
        // Logic to reverse the direction of play
        System.out.println("Play direction is reversed!");
    }
    
}
