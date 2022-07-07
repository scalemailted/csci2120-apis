/**
 * @Author Natalia Mariel Bracamonte
 * @Version 0.1
 */
public class Main{

    /**
     *
     * The main class runs our consume and destroy methods for our Crossbow and Sword.
     */
    public static void main(String[] args){
        Crossbow c = new Crossbow(3); //invoke the constructor of Crossbow, quantity of 3
        System.out.println(c); 
        c.consume(); //get consumed
        System.out.println(c); 
        c.stack(new Crossbow(6)); //stack on top a new set of Crossbow
        System.out.println(c);
        c.destroy(); //get destroyed since it can break
        System.out.println(c);
        printBreakable(c);
        printConsumable(c);
        
        Weapon w = new Sword(2);
        System.out.println(w);
        w.consume();
        System.out.println(w);
        w.stack(new Sword(4)); //stack on top a new set of Sword
        System.out.println(w);
        w.destroy(); //get destroyed since it can break
        System.out.println(w);
        printBreakable(w);
        printConsumable(w);

    }

    /**
     *
     * For the printBreakable method, we are printing out the breakable parts of the Sword and Crossbow.
     */
    public static void printBreakable(Breakable b){
        System.out.println("printBreakable: "+b.getClass());
    }

    /**
     *
     * For the printConsumable method, we are printing out the consumable parts of the Sword and Crossbow.
     */
    public static void printConsumable(Consumable c){
        System.out.println("printConsumable: "+c.getClass());
    }
} //end class Main