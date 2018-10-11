package Array;

/**
 *
 * @author Java
 */
public class DeckOfCards {

    public static void main(String[] args) {
        int deck[] = new int[52];
        String suits[] = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String ranks[] = {"Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        for (int i = 0; i < deck.length; i++) {
            int RandomIndex = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[RandomIndex];
            deck[RandomIndex] = deck[i];
        }

        for (int i = 0; i < 1; i++) {
            String type = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ":" + rank + " of " + type);
        }
        System.out.println("=============Array copy=============");
        int source[] = {5, 34, 6, 8, 10, 454, 35};
        int target[] = new int[10];
        System.arraycopy(source, 3, target, 5, 3);
        for (int i = 0; i < target.length; i++) {
            System.out.print(target[i] + " ");
        }
    }

}
