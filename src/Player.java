public class Player {
    //isdealer
    public boolean isDealer;

    //sum of cards
    public int CardsSum;

    //is bust
    public boolean isBust;

    //the players cards
    public Card[] hand;

    public Player(boolean pIsDealer, int pCardsSum, boolean pIsBust){
isDealer = pIsDealer;
CardsSum = pCardsSum;
isBust = pIsBust;
hand = new Card[2];
    }

    public void print(){
        if(isDealer){
            System.out.println("the dealer has " + CardsSum + " points.");
        }
        System.out.println("Player has " + CardsSum + " points.");
        //TODO: print the hand

        for(int i=0 ; i < hand.length ; i++){
            hand[i].print();
        }
    }
}
