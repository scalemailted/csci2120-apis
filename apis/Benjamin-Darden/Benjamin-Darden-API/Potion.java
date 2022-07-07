
public class Potion implements CarryWeight, Consumable, MarketValue{
	protected String name;
	protected String description;
	protected int quantity;
	protected boolean isHealth;
	protected double weight;
	protected double restoreValue;
	protected int value;
	protected int mktValue;

	// Constructor
	public Potion(String name, String description, int quantity, boolean isHealth, double weight, double restoreValue, int cooldown, int value) {
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.isHealth = isHealth;
		this.weight = weight;
		this.restoreValue = restoreValue;
		this.value = value;
		this.mktValue = rndmMktValue();
	}
	
	// Implemented methods
	public double getWeight() {
		return this.weight;
	}
	public void consume(Player p, int q) {
		this.quantity -= q;
		if (this.isHealth) {
			if ((int)(p.getHP() + this.restoreValue) < p.getMaxHP()){
				p.setHP((int)(p.getHP() + (this.restoreValue*q)));
			} else if ((int)(p.getHP() + (this.restoreValue*q)) >= p.getMaxHP()){
				p.setHP(p.getMaxHP());
			}
		} else {
			if ((int)(p.getMP() + this.restoreValue) < p.getMaxMP()){
				p.setHP((int)(p.getMP() + (this.restoreValue*q)));
			} else if ((int)(p.getMP() + (this.restoreValue*q)) >= p.getMaxMP()){
				p.setHP(p.getMaxMP());
			}
		}
	}
	public void consume(Player p, Player t, int q) {
		this.quantity -= q;
		if (this.isHealth) {
			if ((int)(p.getHP() + this.restoreValue) < p.getMaxHP()){
				p.setHP((int)(p.getHP() + (this.restoreValue*q)));
			} else if ((int)(p.getHP() + (this.restoreValue*q)) >= p.getMaxHP()){
				p.setHP(p.getMaxHP());
			}
		} else {
			if ((int)(p.getMP() + this.restoreValue) < p.getMaxMP()){
				p.setHP((int)(p.getMP() + (this.restoreValue*q)));
			} else if ((int)(p.getMP() + (this.restoreValue*q)) >= p.getMaxMP()){
				p.setHP(p.getMaxMP());
			}
		}
	}
	public void consume(Player p, Enemy t, int q) {
		this.quantity -= q;
		if (this.isHealth) {
			if ((int)(p.getHP() + this.restoreValue) < p.getMaxHP()){
				p.setHP((int)(p.getHP() + (this.restoreValue*q)));
			} else if ((int)(p.getHP() + (this.restoreValue*q)) >= p.getMaxHP()){
				p.setHP(p.getMaxHP());
			}
		} else {
			if ((int)(p.getMP() + this.restoreValue) < p.getMaxMP()){
				p.setHP((int)(p.getMP() + (this.restoreValue*q)));
			} else if ((int)(p.getMP() + (this.restoreValue*q)) >= p.getMaxMP()){
				p.setHP(p.getMaxMP());
			}
		}
	}

	public int rndmMktValue() {
		double randomMkt = Math.random()*4;
		randomMkt -= 3;
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

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isHealth() {
		return isHealth;
	}
	public void setHealth(boolean isHealth) {
		this.isHealth = isHealth;
	}

	public double getRestoreValue() {
		return restoreValue;
	}
	public void setRestoreValue(double restoreValue) {
		this.restoreValue = restoreValue;
	}

	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public int getMktValue() {
		return this.mktValue;
	}
	public void setMktValue(int mktValue) {
		this.mktValue = mktValue;
	}
}