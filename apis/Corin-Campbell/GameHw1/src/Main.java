import java.awt.print.Printable;

public class Main {

    public static void main(String[] args){
        Sword s = new Sword(1);
        System.out.println(s);
        s.stack(new Sword(2));
        s.destroy();
        System.out.println();
        printBreakable(s);

        Apple a = new Apple(5);
        System.out.println(a);
        a.consume();
        System.out.println();
        a.stack(new Apple(10));
        System.out.println();
        a.destroy();
        System.out.println();
        printBreakable(a);
        printConsumeable(a);

    }

    private static void printConsumeable(Consumable c) {System.out.println("printConsumable:  "  +c.getClass());
    }

    private static void printBreakable(Breakable b) {
        System.out.println("printBreakable:  "  +b.getClass());
    }
}
