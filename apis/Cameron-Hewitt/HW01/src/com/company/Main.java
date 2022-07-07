package com.company;

public class Main {

    public static void main(String[] args) {
        MagicScrolls ms = new MagicScrolls(3);
        System.out.println(ms);
        ms.read();
        System.out.println(ms);
        ms.stack(new MagicScrolls(7));
        System.out.println(ms);
        ms.taught();
        System.out.println(ms);
        printReadable(ms);
        printLearnable(ms);

        Books b = new Books(5);
        System.out.println(b);
        b.read();
        System.out.println(b);
        b.stack(new Books(8));
        System.out.println(b);
        printReadable(b);
    }

    public static void printReadable(Readable r) {
        System.out.println("printReadable: " + r.getClass());
    }

    public static void printLearnable(Learnable l) {
        System.out.println("printLearnable: " + l.getClass());
    }
}
