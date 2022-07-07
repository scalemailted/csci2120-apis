
public class Armor implements CarryWeight, Equippable, Heavy, MarketValue {
	protected String name;
	protected String description;
	protected boolean heavy;
	protected double weight;
	protected double damageReduction;
	protected int value;
	protected int mktValue;

	//Constructor
	public Armor(String name, String description, boolean heavy, double weight, double damageReduction, int value) {
		this.name = name;
		this.description = description;
		this.heavy = heavy;
		if (heavy) {
			this.weight = weight*1.25;
			this.damageReduction = damageReduction*1.25;
		} else {
			this.weight = weight;
			this.damageReduction = damageReduction;
		}
		this.value=value;
		this.mktValue=rndmMktValue();
	}
	
	//Implemented methods
	public double getWeight() {
		return this.weight;
	}
	
	public void unequip(Player p) {
		if (p.armorEquipped) {
			p.damageReduction -= this.damageReduction;
			p.heldWeight -= this.getWeight();
		}
	}
	public void unequip(Enemy e) {
		if (e.armorEquipped) {
			e.damageReduction -= this.damageReduction;
		}
	}
	public void equip(Armor current, Player p) {
		current.unequip(p);
		p.damageReduction += this.damageReduction;
		p.heldWeight += this.getWeight();
	}
	public void equip(Armor current, Enemy e) {
		current.unequip(e);
		e.damageReduction += this.damageReduction;
	}
	public void equip(Weapon current, Player p) {
	}
	public void equip(Weapon current, Enemy e) {
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

	public double getDamageReduction() {
		return damageReduction;
	}
	public void setDamageReduction(double damageReduction) {
		this.damageReduction = damageReduction;
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
	
	public boolean getHeavy() {
		return this.heavy;
	}
	public void setHeavy(boolean heavy) {
		this.heavy = heavy;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
