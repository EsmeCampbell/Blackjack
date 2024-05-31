public class Player {
    //isdealer
    public boolean isDealer;

    //sum of cards
    public int CardsSum;

    //is bust
    public boolean isBust;

    public String Name;

    //the players cards
    public Card[] hand;

    public Player(boolean pIsDealer, int pCardsSum, boolean pIsBust, String pName){
isDealer = pIsDealer;
CardsSum = pCardsSum;
isBust = pIsBust;
Name = pName;
hand = new Card[2];
    }

    public void print() {
        if (isDealer) {
            System.out.println("the dealer has " + CardsSum + " points.");
            for (int i = 0; i < hand.length; i++) {
                hand[i].print();
            }
        } else {
            System.out.println(Name + " Player " + " has " + CardsSum + " points:");

            //TODO: print the hand

            for (int i = 0; i < hand.length; i++) {
                hand[i].print();
            }
        }
    }
}
