package PickACard;

class Card {
    int value;
    String suit;
    String name;

    public String toString() {
        return name + " of " + suit;
    }
}

public class PickACard {
    public static void main(String[] args) {
        Card[] deck = buildDeck();
//        displayDeck(deck);

        int chosen = (int) (Math.random() * deck.length);
        Card picked = deck[chosen];

        System.out.println("You picked a " + picked + " out of the deck,");
        System.out.println(" worth " + picked.value + " points in BlackJack.");

        shuffleDeck(deck);
    }

    public static Card[] buildDeck() {
        String[] suits = {"clubs", "diamonds", "hearts", "spades"};
        String[] names = {"ZERO", "ONE", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "Jack", "Queen", "King", "Ace"};

        int i = 0;
        Card[] deck = new Card[52];

        for (String s : suits) {
            for (int v = 2; v <= 14; v++) {
                Card c = new Card();
                c.suit = s;
                c.name = names[v];
                if (v == 14) {
                    c.value = 11;
                } else if (v > 10) {
                    c.value = 10;
                } else {
                    c.value = v;
                }
                deck[i] = c;
                i++;
            }
        }
        return deck;
    }

    public static void displayDeck(Card[] deck) {
        for (Card c : deck) {
            System.out.println(c.value + "\t" + c);
        }
    }

    public static void shuffleDeck(Card[] deck) {
        Card temp;
        int times = 1000, rand1, rand2;

        for (int i = 0; i < times; i++) {
            rand1 = (int) (Math.random() * deck.length);
            rand2 = (int) (Math.random() * deck.length);
            temp = deck[rand1];
            deck[rand1] = deck[rand2];
            deck[rand2] = temp;
        }
        displayDeck(deck);
    }
}
