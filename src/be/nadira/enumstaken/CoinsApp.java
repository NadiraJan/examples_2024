package be.nadira.enumstaken;

public class CoinsApp {

    public static void main(String[] args) {

        Coins[] coins = {Coins.TWENTY_CENT, Coins.ONE_EURO, Coins.FIVE_CENT};

        int total = 0;

        for (Coins c : coins) {

            total += c.getVALUE();
        }

        System.out.println(total);
    }
}
