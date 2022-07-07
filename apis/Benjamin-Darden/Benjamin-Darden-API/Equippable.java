// Interface for items classified as "equipment," anything that can be worn or held to change Player statistics.

public interface Equippable {
	public void equip(Armor current, Player p);
	public void equip(Weapon current, Player p);
	public void equip(Armor current, Enemy e);
	public void equip(Weapon current, Enemy e);
	public void unequip(Player p);
	public void unequip(Enemy e);
}