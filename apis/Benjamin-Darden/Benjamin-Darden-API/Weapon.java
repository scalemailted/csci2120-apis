
public class Weapon implements CarryWeight, Equippable, Heavy, MarketValue {
	protected String name;
	protected String description;
	protected boolean heavy;
	protected double weight;
	protected double damage;
	protected int value;
	protected int mktValue;

	//Constructor
	public Weapon(String name, String description, boolean heavy, double weight, double damage, int value) {
		this.name = name;
		this.description = description;
		this.heavy = heavy;
		if (isHeavy()) {
			this.weight = weight*1.25;
			this.damage = damage*1.25;
		} else {
			this.weight = weight;
			this.damage = damage;
		}
		this.value=value;
		this.mktValue=rndmMktValue();
	}
	
	// Implemented methods
	public double getWeight() {
		return this.weight;
	}
	public void unequip(Player p) {
		if (p.weaponEquipped) {
			p.damage -= this.damage;
			p.heldWeight -= this.getWeight();
		}
	}
	public void unequip(Enemy e) {
		if (e.weaponEquipped) {
			e.damage -= this.damage;
		}
	}
	public void equip(Weapon current, Player p) {
		current.unequip(p);
		p.damage += this.damage;
		p.heldWeight += this.getWeight();
	}
	public void equip(Weapon current, Enemy e) {
		current.unequip(e);
		e.damage += this.damage;
	}
	public void equip(Armor current, Player p) {
	}
	public void equip(Armor current, Enemy e) {
	}
	public boolean isHeavy() {
		return this.heavy;
	}
	public int rndmMktValue() {
		double randomMkt = Math.random()*5;
		randomMkt -= 2.5;
		return (int)(this.getValue() + randomMkt);
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

	public double getDamage() {
		return damage;
	}
	public void setDamage(double damage) {
		this.damage = damage;
	}

	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

	public int getMktValue() {
		return mktValue;
	}
	public void setMktValue(int mktValue) {
		this.mktValue = mktValue;
	}

	public void setHeavy(boolean heavy) {
		this.heavy = heavy;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
