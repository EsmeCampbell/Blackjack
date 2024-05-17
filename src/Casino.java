public class Casino {

    public Card Card;

    public Card[] deck;
    public static void main(String[] args) {
        Casino x = new Casino();
    }

    public Casino() {
        System.out.println("Welcome to Esme's Casino!");

        deck = new Card[52];

        int door = 0;
        for (int j = 0; j < 4; j++){
            for (int i = 0; i < 13; i++) {
                Card = new Card(i, j);
                Card.print();
                deck[door] = Card;
                door ++;
            }
        }
        printDeck();
    }

    public void printDeck() {
        for (int i = 0; i < deck.length; i++) {
            deck[i].print();
        }
    }
}
