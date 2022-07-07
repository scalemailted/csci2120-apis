/**
 * @author christianl
 * @apiNote The purpose of this abstract class is to create an object of a gamblep (player)
 */
public abstract class PlayerBase {
    protected String playerName;
    protected int playerValue;

    /**
     * @param playerName
     * @param playerValue
     * @apiNote Constructor for PlayerBase.
     */
    public PlayerBase(String playerName, int playerValue) {
        this.playerName = playerName;
        this.playerValue = playerValue;
    }

    /**
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * @param playerName the playerName to set
     * @apiNote This allows the user to set the name of the player
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     *
     * @return playerValue
     */
    public int getPlayerValue() {
        return playerValue;
    }

    /**
     *
     * @param playerValue
     * @apiNote This method sets the playerValue
     */
    public void setPlayerValue(int playerValue) {
        this.playerValue = playerValue;
    }
}
