package cardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Card Suits:");
//        for (CardSuit value : CardSuit.values()) {
//            System.out.printf("Ordinal value: %d; Name value: %s\n",value.ordinal(),value.name());
//        }
//        System.out.println("Card Ranks:");
//        for (CardRank cardRanks : CardRank.values()) {
//            System.out.printf("Ordinal value: %d; Name value: %s\n",cardRanks.ordinal(),cardRanks.name());
//        }
        Scanner scanner = new Scanner(System.in);
        CardRank cardRank= CardRank.valueOf(scanner.nextLine());
        CardSuit cardSuit=CardSuit.valueOf(scanner.nextLine());
        int cardPower=cardRank.getPower()+cardSuit.getPower();
        System.out.printf("Card name: %s of %s; Card power: %d",cardRank,cardSuit,cardPower);
    }
}
