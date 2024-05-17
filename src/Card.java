public class Card {
    //suit -> spade, hearts
    public String Suit;

    //value -> 1-11
    public int Value;

    //name ->Ace, 2, 3, ... Jack, Queen, King
    public String Name;

    public Card(String pSuit, int pValue, String pName){
        Suit = pSuit;
        Value = pValue;
        Name = pName;
    }

    public void display(){System.out.println("Card is the " + Name + " of " + Suit + ", valued at:" + Value);}

}
