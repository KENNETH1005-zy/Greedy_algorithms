import java.util.ArrayList;

class ChangeMachine {
    public static int[] coins = {25, 10, 5, 1};
    public static ArrayList <Integer> getMinCoins(int amount) {
        ArrayList <Integer> change = new ArrayList<Integer> ();
        for (int i = 0; i < coins.length  && amount > 0; i++) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                change.add(coins[i]);
            }
        }
        return change;
    }
    public static void main(String args[]) {
        int amount = 100;
        System.out.println(getMinCoins(amount));
    }
}