
public class Player {
	protected String name;
	protected int maxHP;
	protected int maxMP;
	protected int HP;
	protected int MP;
	protected double damageReduction;
	protected double damage;
	protected boolean armorEquipped;
	protected boolean weaponEquipped;
	protected Armor armor;
	protected Weapon weapon;
	protected double carryCapacity;
	protected double heldWeight;
	protected int gold;
	
	// Constructor
	public Player (String name, int HP, int MP, double damageReduction, double damage, boolean armorEquipped, boolean weaponEquipped, Armor armor, Weapon weapon, double carryCapacity, double heldWeight, int gold) {
		this.name = name;
		this.HP = HP;
		this.MP = MP;
		this.damageReduction = damageReduction;
		this.damage = damage;
		this.armorEquipped = armorEquipped;
		this.weaponEquipped = weaponEquipped;
		this.armor = armor;
		this.weapon = weapon;
		this.carryCapacity = carryCapacity;
		this.heldWeight = heldWeight;
		this.gold = gold;
		armor.equip(armor, this);
		weapon.equip(weapon, this);
	}
	
	// Damage methods
	public void damageOther(Enemy target) {
		target.setHP((int)(target.getHP() - this.damage + target.damageReduction));
	}
	public void damageOther(Player target) {
		target.setHP((int)(target.getHP() - this.damage + target.damageReduction));
	}
	
	public void takeDamage(Enemy attacker) {
		this.setHP((int)(this.getHP() - attacker.damage + this.damageReduction));
	}
	public void takeDamage(Player attacker) {
		this.setHP((int)(this.getHP() - attacker.damage + this.damageReduction));
	}

	// Getters, Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMaxHP() {
		return maxHP;
	}
	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}

	public void setMaxMP(int maxMP) {
		this.maxMP = maxMP;
	}
	public int getMaxMP(){
		return maxMP;
	}
	
	public int getHP() {
		return HP;
	}
	public void setHP(int HP) {
		this.HP = HP;
	}
	
	public int getMP() {
		return MP;
	}
	public void setMP(int MP) {
		this.MP = MP;
	}
	
	public Armor getArmor() {
		return this.armor;
	}
	public void setArmor(Armor armor) {
		this.armor = armor;
	}
	
	public Weapon getWeapon() {
		return this.weapon;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public double getCarryCapacity() {
		return carryCapacity;
	}
	public void setCarryCapacity(double carryCapacity) {
		this.carryCapacity = carryCapacity;
	}
	
	public double getHeldWeight() {
		return heldWeight;
	}
	public void setHeldWeight(double heldWeight) {
		this.heldWeight = heldWeight;
	}
	
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
}
