package src;

import src.Arrow;
import src.Potion;
import src.Water;

/**
 * @author Amanda Nguyen
 * @since   6/16/22
 */
public class Main {
    public static void main(String[] args){
        Potion p = new Potion(3);
        Water w = new Water(3);
        Arrow arrows = new Arrow(16);
        EmptyBottle eb = new EmptyBottle(3);
        IronLongSword ils = new IronLongSword();
        IronHelmet ih = new IronHelmet();

        System.out.println(w);
        w.consume();
        System.out.println(w);
        w.stack(new Water(2));
        System.out.println(w);
        w.destroy();
        System.out.println(w);
        System.out.println(eb);

        /*printBreakable(p);
        printConsumable(p);*/

        /*public static void printBreakable(src.Breakable b){
            System.out.println("printBreakable:  "+b.getClass());
        }

        public static void printConsumable(src.Consumable c){
            System.out.println("printConsumable:  "+c.getClass());
        } */


    }
}//end main
