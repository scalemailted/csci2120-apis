/**
 * @author christianl
 * @apiNote Chips holds the value of chips the player has and implements methods to buy and sell chips.
 */
public abstract class Chips extends PlayerBase implements Buyin, Cashout{

    protected int betQuantity;
    protected int chipQuantity;
    protected int chipValue;
    protected int minBuyin;

    /**
     *
     * @param playerName
     * @param playerValue
     * @param chipQuantity
     * @param betQuantity
     * @param minBuyin
     * @param chipValue
     * @apiNote Constructor for Chips.
     */
    public Chips(String playerName, int playerValue, int chipQuantity, int betQuantity, int minBuyin, int chipValue) {
        super(playerName, playerValue);
        this.chipQuantity = chipQuantity;
        this.minBuyin = minBuyin;
        this.chipValue = chipValue;
        this.betQuantity = betQuantity;
    }

    /**
     *
     * @param b the desired buyin amount
     * @updates the chipQuantity
     * @throws IllegalArgumentException if the betQuantity is less than the minBuyin or if the player cannot afford
     * the buyin amount
     * @apiNote This allows the player to buy chips
     */
    @Override
    public void buyChips(Buyin b) {
        if (b instanceof Chips) {
            Chips chips = (Chips) b;
            if (chips.getChipQuantity() >= minBuyin && chips.getChipQuantity() * this.getChipValue() <= this.getPlayerValue()) {
                this.setPlayerValue(this.getPlayerValue() - chips.getChipQuantity() * this.getChipValue());
                this.setChipQuantity(chips.getChipQuantity() + this.getChipQuantity());
            }
            else {
                throw new IllegalArgumentException("You cannot buy that amount of chips");
            }
        }
    }

    /**
     *
     * @param c the desired cashout amount
     * @updates the chipQuantity
     * @throws IllegalArgumentException if there are not enough chips to cashout as requested
     * @apiNote This allows the player to sell chips
     */
    @Override
    public void cashOut(Cashout c) {
        if (c instanceof Chips) {
            Chips chips = (Chips) c;
            if (chips.getChipQuantity() <= this.getChipQuantity()) {
                this.setChipQuantity(this.getChipQuantity() - chips.getChipQuantity());
                this.setPlayerValue(this.getPlayerValue() + chips.getChipQuantity() * this.getChipValue());
            }
            else {
                throw new IllegalArgumentException("You cannot cash out more chips than you have");
            }
        }
    }

    /**
     *
     * @return chipQuantity
     * @apiNote Returns the quantity of chips the player has.
     *
     */
    public int getChipQuantity() {
        return chipQuantity;
    }

    /**
     *
     * @param chipQuantity the chipQuantity to set
     * @apiNote Sets the quantity of chips the player has.
     */
    public void setChipQuantity(int chipQuantity) {
        this.chipQuantity = chipQuantity;
    }

    /**
     *
     * @return betQuantity
     * @apiNote Returns the quantity of chips to be bet.
     *
     */
    public int getBetQuantity() {
        return betQuantity;
    }

    /**
     *
     * @param betQuantity the betQuantity to set
     * @apiNote Sets the value of a chip.
     *
     */
    public void setBetQuantity(int betQuantity) {
        this.betQuantity = betQuantity;
    }

    /**
     *
     * @return minBuyin
     * @apiNote Returns the value of the minimum buyin.
     *
     */
    public int getMinBuyin() {
        return minBuyin;
    }

    /**
     *
     * @param minBuyin the minBuyin to set
     * @apiNote Sets the value of a minimum buyin.
     *
     */
    public void setMinBuyin(int minBuyin) {
        this.minBuyin = minBuyin;
    }

    /**
     *
     * @return chipValue
     * @apiNote Returns the value of a chip.
     *
     */
    public int getChipValue() {
        return chipValue;
    }

    /**
     *
     * @param chipValue the chipValue to set
     * @apiNote Sets the value of a chip.
     *
     */
    public void setChipValue(int chipValue) {
        this.chipValue = chipValue;
    }
}
