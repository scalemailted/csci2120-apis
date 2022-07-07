import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.rpg.items.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class WarriorTest {

    private Player player;
    private Item item1;
    private Item item2;
    private Item item3;
    private Item item4;

    @BeforeEach
    void setUp() {
        player = new Warrior("Wandering warrior",3);

        item1 = new Axe("Golden axe", 2.2, 12, 7);
        item2 = new Sword("Short sword", 1.2, 6, 5);
        item3 = new Shield("Bronze shield", 3.3, 8, 4);
        item4 = new Shield("Wooden shield", 1.3, 3, 2);
    }


    @Test
    void assertThrowsException() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Warrior("Wandering warrior",-1);
        });
    }
    @Test
    void setWeaponTest(){
        assumeTrue(player.setWeapon(item1)); //item1 implements interface org.rpg.interfaces.Weapon
        assertFalse(player.setWeapon(item3));//item3 implements interface org.rpg.interfaces.Armor
        assertEquals(player.getWeapon(), item1);
    }

    @Test
    void setArmorTest(){
        assertFalse(player.setArmor(item1)); //item1 implements interface org.rpg.interfaces.Weapon
        assumeTrue(player.setArmor(item3));//item3 implements interface org.rpg.interfaces.Armor
        assertEquals(player.getArmor(), item3);

    }
    @Test
    void addItemTest(){
        assumeTrue(player.addItem(item1));
        assertEquals(1,player.getItemsCount());
        assumeTrue(player.addItem(item2));
        assertEquals(2,player.getItemsCount());
        assumeTrue(player.addItem(item3));
        assertEquals(3,player.getItemsCount());
        assertFalse(player.addItem(item4));
        assertEquals(3,player.getItemsCount());

    }
    @Test
    void removeItemTest(){
        assumeTrue(player.addItem(item1));
        assertEquals(1,player.getItemsCount());
        assumeTrue(player.removeItem(item1));
        assertEquals(0,player.getItemsCount());
        assertFalse(player.removeItem(item3));


    }

}