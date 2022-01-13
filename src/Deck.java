/*
 * @author Gateway Instructors
 * @version 1.0
 */

import java.util.Collections;
import java.util.Arrays;
import java.util.List;

/**
 * This class represents a standard deck (52 playing cards).
 */
public class Deck extends CardCollection {

   /**
    * Create a new full standard playing card deck that contains
    * 52 cards in standard order, using the generic label "Deck".
    */

   public Deck() {
      CardCollection deck = new CardCollection("Deck");
      for (int i = 0; i < 4; i++) { // 4 suits
         for (int j = 0; j < 13; j++) { // 13 ranks
            deck.addCard(new Card(j, i));
         }
      }
   }
   
   
   /**
    * Create a new full standard playing card deck that contains
    * 52 cards in standard order, using the specified label.
    * @param label the label used to name this deck
    */

   public Deck(String label) {
      CardCollection deck = new CardCollection(label);
      for (int i = 0; i < 4; i++) { // 4 suits
         for (int j = 0; j < 13; j++) { // 13 ranks
            deck.addCard(new Card(j, i));
         }
      }
   }


   /**
    * Randomly permute the cards in this deck, leaving out nulls.
    */
   public void shuffle() {

      // Create a right-sized version of Cards array to avoid shuffling
      // in the nulls that might exist at the end of our Cards array
      Card[] rightSized = new Card[numFilled];
      System.arraycopy(this.cards, 0, rightSized, 0, numFilled);      

      List<Card> list = Arrays.asList(rightSized);
      Collections.shuffle(list);
      System.arraycopy(list.toArray(), 0, this.cards, 0, numFilled);
      
   }
   
}
