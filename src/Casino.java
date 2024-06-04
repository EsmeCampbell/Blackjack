
import java.util.Scanner;
public class Casino {

    public Card Card;

    public Player You;

    public Player Jai;

    public Player Dealer;

    public Card[] deck;
    public int hand = 3;
    public int deck2 = 4;
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
        //printDeck();

        You = new Player(false,0,false, "Your");

        Jai = new Player(false,0,false,"Jai's");

        Dealer = new Player(true,0,false, "Dealer");

        System.out.println("Deal:");
        deal();
        You.print();
        Jai.print();
        Dealer.print();
        ask();

    }

    public void deal(){
        // give the player the first and second cards in our deck
        Dealer.hand[0] = deck[0];
        Dealer.hand[1] = deck[1];
        Dealer.CardsSum = Dealer.hand[0].Value + Dealer.hand[1].Value;

        You.hand[0] = deck[2];
        You.hand[1] = deck[3];
        You.CardsSum = You.hand[1].Value + You.hand[0].Value;

        Jai.hand[0] = deck[4];
        Jai.hand[1] = deck[5];
        Jai.CardsSum = Jai.hand[0].Value + Jai.hand[1].Value;

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
    public void ask(){
        // Source: https://www.w3schools.com/java/java_user_input.asp
        Scanner myObj = new Scanner(System.in);
        System.out.println("Would you like to hit or stand? Please respond: 'hit' or 'stand'");

        String userName = myObj.nextLine();
        System.out.println("You chose to " + userName);

        if(userName.equals("hit")){
            Card[] newArray = new Card[You.hand.length + 1];
            for(int i =0; i< newArray.length -1; i++){
                newArray[i] = You.hand[i];
            }
            newArray[newArray.length -1] = deck[deck2];
            You.hand = newArray;
            hand++;
            deck2++;
            You.CardsSum = You.CardsSum + deck[deck2-1].Value;
            You.print();

        }

    }
}
