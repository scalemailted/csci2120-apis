
public class Scroll implements CarryWeight, Consumable, MarketValue{
	protected String name;
	protected String description;
	protected int quantity;
	protected double weight;
	protected Spell sp;
	protected int value;
	protected int mktValue;

	//Constructor
	public Scroll(String name, String description, int quantity, double weight, Spell sp, int value) {
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.weight = weight;
		this.sp = sp;
		this.value = value;
		this.mktValue = rndmMktValue();
	}
	
	//Implemented methods
	public double getWeight() {
		return this.weight;
	}
	
	public void consume(Player u, int q) {
		this.quantity -= q;
		for (int i=1; i<=q; i++) {
			this.sp.cast(u);
		}
	}
	public void consume(Player u, Enemy t, int q) {
		this.quantity -= q;
		for (int i=1; i<=q; i++) {
			this.sp.cast(u, t);
		}
	}
	public void consume(Player u, Player t, int q) {
		this.quantity -= q;
		for (int i=1; i<=q; i++) {
			this.sp.cast(u, t);
		}
	}
	
	public int rndmMktValue() {
		double randomMkt = Math.random()*4;
		randomMkt -= 3;
		return (int)(this.getValue() + randomMkt);
	}

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
	public Spell getSp() {
		return sp;
	}
	public void setSp(Spell sp) {
		this.sp = sp;
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
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
