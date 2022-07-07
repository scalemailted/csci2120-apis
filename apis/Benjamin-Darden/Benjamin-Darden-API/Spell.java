
public class Spell {
	protected String name;
	protected String description;
	protected int HPValue;
	protected int cost;
	protected boolean isDamage;
	protected boolean scroll;
	
	public Spell(String name, String description, boolean isDamage, boolean scroll, int HPValue, int cost) {
		this.name = name;
		this.description = description;
		this.isDamage = isDamage;
		this.scroll = scroll;
		this.HPValue = HPValue;
		if (scroll) this.cost = 0;
		else this.cost = cost;
	}
	
	public void cast(Player user) {
		user.setMP(user.getMP() - this.cost);
	}
	public void cast(Player user, Player target) {
		user.setMP(user.getMP() - this.cost);
		if (isDamage) {
			target.setHP(target.getHP() - this.getHPValue());
		} else {
			target.setHP(target.getHP() + this.getHPValue());
		}
	}
	public void cast(Player user, Enemy target) {
		if (isDamage) {
			target.setHP(target.getHP() - this.getHPValue());
		} else {
			target.setHP(target.getHP() + this.getHPValue());
		}
	}
	
	// Getters, Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getHPValue() {
		return HPValue;
	}
	public void setHPValue(int hPValue) {
		HPValue = hPValue;
	}
	
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public boolean isDamage() {
		return isDamage;
	}
	public void setDamage(boolean isDamage) {
		this.isDamage = isDamage;
	}
	
	public boolean getScroll() {
		return scroll;
	}
	public void setScroll(boolean scroll) {
		this.scroll = scroll;
	}
}
