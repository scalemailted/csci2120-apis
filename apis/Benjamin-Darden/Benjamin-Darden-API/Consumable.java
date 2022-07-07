public interface Consumable {
	public void consume(Player p, int quantity);
	public void consume(Player p, Player t, int quantity);
	public void consume(Player p, Enemy t, int quantity);
}
