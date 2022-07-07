import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ArmorTest {
	
	private Armor heavyTest;
	private Armor lightTest;
	private Armor noTest;
	private Weapon test;
	private Player p;
	private Enemy e1;
	private Enemy e2;
	
	@Before
	public void setUp() {
		Armor heavyTest = new Armor("Heavy Test Armor", "Heavy Armor only used in tests", true, 34.0, 30.0, 100);
		Armor lightTest = new Armor("Regular Test Armor", "Light Armor only used in tests", false, 34.0, 30.0, 100);
		Armor noTest = new Armor("No Test Armor", "No Armor only used in tests", false, 0.0, 0.0, 0);
		Weapon test = new Weapon("Test Weapon", "Weapon that does 50 damage for testing", false, 20.0, 50.0, 100);
		Player p = new Player("Tester", 100, 100, 25, 25, true, true, lightTest, test, 150.0, 25.0, 500);
		Enemy e1 = new Enemy ("Armored Dummy", 100, 100, lightTest, test, true, true, 0.0, 5.0);
		Enemy e2 = new Enemy ("Unarmored Dummy", 100, 100, noTest, test, false, true, 0.0, 5.0);
	}

	@Test
	public void testHeavy() {
		assertEquals(34.0*1.25, heavyTest.getWeight(), 0.001);
	}
	
	@Test
	public void testLight() {
		assertEquals(34.0, lightTest.getWeight(), 0.001);
	}
	
	@Test
	public void testMktValue() {
		assertTrue((double)lightTest.getValue() - 2.5 <= (double)lightTest.rndmMktValue() && lightTest.rndmMktValue() <= (double)lightTest.value + 2.5);
	}

	@Test
	public void testDamageReduction() {
		double idealReduction = e1.damageReduction;
		p.damageOther(e1);
		p.damageOther(e2);
		double actualReduction = (double)(e1.getHP() - e2.getHP());
		assertEquals(idealReduction, actualReduction, 0.001);
	}
}
