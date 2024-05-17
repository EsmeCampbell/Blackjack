public class Card {
    //suit -> spade, hearts
    public String Suit;

    //value -> 1-11
    public int Value;

    //name ->Ace, 2, 3, ... Jack, Queen, King
    public String Name;

    public Card(int pName, int pSuit){

        if(pName == 0){
            Value = 11;
            Name = "Ace";
        }
        if(pName == 1){
            Value = 2;
            Name = "Two";
        }
        if(pName == 2){
            Value = 3;
            Name = "Three";
        }
        if(pName == 3){
            Value = 4;
            Name = "Four";
        }
        if(pName == 4){
            Value = 5;
            Name = "Five";
        }
        if(pName == 5){
            Value = 6;
            Name = "Six";
        }
        if(pName == 6){
            Value = 7;
            Name = "Seven";
        }
        if(pName == 7){
            Value = 8;
            Name = "Eight";
        }
        if(pName == 8){
            Value = 9;
            Name = "Nine";
        }
        if(pName == 9){
            Value = 10;
            Name = "Ten";
        }
        if(pName == 10){
            Value = 10;
            Name = "Jack";
        }
        if(pName == 11){
            Value = 10;
            Name = "Queen";
        }
        if(pName == 12){
            Value = 10;
            Name = "King";
        }
        if(pSuit == 0){
            Suit = "Hearts";
        }
        if(pSuit == 1){
            Suit = "Spades";
        }
        if(pSuit == 2){
            Suit = "Hearts";
        }
        if(pSuit == 3){
            Suit = "Clubs";
        }
    }



    public void print(){System.out.println("The " + Name + " of " + Suit + " is worth " + Value + " points.");}

}
