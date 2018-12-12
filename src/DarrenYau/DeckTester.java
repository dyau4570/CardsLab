package DarrenYau;

public class DeckTester {
    public static void main(String[] args) {
        String[] suits = {"Diamonds","Clubs","Hearts","Spades"};
        String[] ranks = {"1","2","3","4"};
        int[] pointValues = {1,2,3,4};
        Deck deck = new Deck(suits,ranks,pointValues);
        System.out.println(deck.getUnDealt());
        System.out.println(deck.getDealt());
        deck.shuffle();
        while(deck.size() > 0) {
            System.out.println(deck.deal());
        }
    }
}