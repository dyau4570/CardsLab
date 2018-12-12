package DarrenYau;

import java.util.ArrayList;

public class Deck {
    ArrayList<Card> unDealt;
    ArrayList<Card> Dealt;

    public Deck(String[] rank, String[] suit, int[] pointValue){
        Dealt = new ArrayList<Card>();
        unDealt = new ArrayList<Card>();
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                Card newCard = new Card(rank[j], suit[i], pointValue[j]);
                unDealt.add(newCard);
            }
        }
    }

    public ArrayList<Card> getDealt() {
        return Dealt;
    }

    public ArrayList<Card> getUnDealt() {
        return unDealt;
    }

    public boolean isEmpty() {
        if(unDealt.size() == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return unDealt.size();
    }

    public Card deal() {
        if(unDealt.size() > 0) {
            Card temp = unDealt.get(0);
            Dealt.add(temp);
            unDealt.remove(0);
            return temp;
        }
        return null;
    }


    public void shuffle() {
        unDealt.addAll(Dealt);
        while(Dealt.size()>0) {
            Dealt.remove(0);
        }
        for(int i = unDealt.size()-1; i > 0; i--) {
            int pos = (int)(Math.random() * i);
            Card temp = unDealt.get(i);
            unDealt.set(i, unDealt.get(i));
            unDealt.set(pos, temp);
        }
    }
}