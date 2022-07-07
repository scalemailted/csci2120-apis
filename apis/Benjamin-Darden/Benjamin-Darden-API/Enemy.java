
public class Enemy {
	protected String name;
	protected int maxHP;
	protected int maxMP;
	protected int HP;
	protected int MP;
	protected Armor armor;
	protected Weapon weapon;
	protected boolean armorEquipped;
	protected boolean weaponEquipped;
	protected double damageReduction;
	protected double damage;
	
	public Enemy (String name, int hp, int mp, Armor armor, Weapon weapon, boolean armorEquipped, boolean weaponEquipped, double damageReduction, double damage) {
		this.name = name;
		this.HP = hp;
		this.MP = mp;
		this.armor = armor;
		this.weapon = weapon;
		this.armorEquipped = armorEquipped;
		this.weaponEquipped = weaponEquipped;
		this.damageReduction = damageReduction;
		this.damage = damage;
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

	public int getMaxMP() {
		return maxMP;
	}
	public void setMaxMP(int maxMP) {
		this.maxMP = maxMP;
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
}