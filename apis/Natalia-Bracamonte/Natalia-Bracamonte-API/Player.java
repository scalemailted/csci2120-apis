public abstract class Player{

    /**
     * @param name is for the player's name
     * @param level is for the player's level
     * @param weapon is for the player's weapon
     */
    private String playerName;
    private int playerLevel;
    private Weapon playerWeapon;

    /**
     * We have created a Player constructor that makes name = name, level = level and, weapon = weapon
     */

    public Player(String name, int level, Weapon weapon) {
        this.playerName = playerName;
        this.playerLevel = playerLevel;
        this.playerWeapon = playerWeapon;
    }

    public String getPlayerName(){
        return playerName;
    }

    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }

    public int getPlayerLevel(){
        return playerLevel;
    }

    public void setPlayerLevel(int playerLevel){
        this.playerLevel = playerLevel;
    }

    public Weapon getPlayerWeapon(){
        return playerWeapon;
    }

    public void setPlayerWeapon(Weapon playerWeapon){
        this.playerWeapon = playerWeapon;
    }
} //end class Player