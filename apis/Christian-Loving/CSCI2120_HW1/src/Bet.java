/**
 * @author christianl
 * @apiNote
 */
public class Bet extends Chips implements Win, Lose {

    /**
     * @param betQuantity
     * @apiNote Constructor for Bet.
     */
    public Bet(int betQuantity) {
        super("Chet Manly", 1_000_000, 100, betQuantity, 10, 50);
    }

    /**
     * @apiNote Instance of Bet.
     */
    public Bet() {
        this(10);
    }

    /**
     *
     * @updates the chipQuantity
     * @apiNote This allows the player to win the chips bet.
     */
    @Override
    public void win() {
        this.setChipQuantity(this.getChipQuantity() + this.betQuantity);
    }

    /**
     *
     * @updates the chipQuantity
     * @apiNote This allows the player to lose the chips bet.
     */
    @Override
    public void lose() {
        this.setChipQuantity(this.getChipQuantity() - this.betQuantity);
    }

    /**
     *
     * @return String description of the players financial status
     * @apiNote This allows us to see how the player is doing and if he has money / chips left
     */
    @Override
    public String toString() {
        String text = String.format("%s has $%d in his account and is holding %d chips.",playerName,playerValue,
                chipQuantity);
        return text;
    }
}
