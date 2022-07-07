/**
 * @author christianl
 * @since 6-15-2022
 * @version 0.3
 * @apiNote The purpose of this inventory system is to implement the bet class
 */
public class main {
    public static void main(String[] args) {
        Bet ante = new Bet(10);
        System.out.println(ante);
        ante.lose();
        System.out.println(ante);
        ante.buyChips(new Bet(10));
        System.out.println(ante);
        ante.win();
        System.out.println(ante);
        printLoser(ante);
        printWinner(ante);

    }

    /**
     *
     * @param winner
     */
    public static void printWinner(Win winner) {
        System.out.println("printWinner:  " + winner.getClass());
    }

    /**
     *
     * @param loser
     */
    public static void printLoser(Lose loser) {
        System.out.println("printLoser:  " + loser.getClass());
    }

}
