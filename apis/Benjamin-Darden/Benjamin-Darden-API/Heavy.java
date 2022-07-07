// Interface to define a "heavy" variant of an existing equipment
// i.e. "heavy" iron sword, "heavy" chain armor
// that will have higher effective statistics (damage, damage reduction) but higher carry weight,
// providing a harsher restriction on inventory management.

public interface Heavy {
	public boolean isHeavy();
}