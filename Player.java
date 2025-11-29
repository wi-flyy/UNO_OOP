package UNO;
import java.util.ArrayList;
import java.util.List;
import javax.smartcardio.Card;
import javax.smartcardio.Game;

public class Player {
  
    private  int id;                                // attributes :
    private  List<Card> hand;


   public Player(int id) {
        this.id = id;                              // constractor 
        this.hand = new ArrayList<>();             
    }




public int handSize() {
        return hand.size();  //displays the size of the hand
    }

public void playcard(int cardIndex , Game game){
     
   if (cardIndex < 0 || cardIndex >= hand.size()) {
            System.out.println("Invalid card index!");
            
        }
        Card chosenCard = hand.get(cardIndex);
         //the checking of the condittion
       hand.remove(cardIndex);

}



public void  sayUNO() {
        if (hand.size() == 1) {
            System.out.println("Player " + id + " : UNOOO!"); // if the player has one card left he says UNO
        }else {
            System.out.println("You cannot say UNO now! You have " + hand.size() + " cards.");
        }
    }


   public int getId() {
        return id;     //geter for the id 
    }

    @Override
    public String toString() {
        return "Player " + id + " (" + hand.size() + " cards)";
    }

    public boolean hasWon() {
        return hand.isEmpty();  //checks if the player has won
    }
 
}
