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
                deck[door] = Card;
                door ++;
            }
        }
        Shuffle();
        printDeck();
    }

    public void printDeck() {
        for (int i = 0; i < deck.length; i++) {
            deck[i].print();
        }
    }
    public void Shuffle() {
        //put cards at random index
        //swap cards random index in index i

        for (int i = 0; i < 52; i++) {
            int esme = (int) (Math.random() * 52);
            System.out.println(esme);
            Card temp = deck[0];
            deck[0] = deck[esme];
            deck[esme] = temp;
        }
    }
}
