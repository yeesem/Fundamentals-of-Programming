package LAB_8.Q1;

public class L8Q1 {
    public static void main(String[] args) {
        Number a = new Number();
        Number b = new Number(5);
        Number c = new Number(4, 50);

        System.out.println("Number a");
        a.displayAll();
        System.out.println();

        System.out.println("Number b");
        b.displayAll();
        System.out.println();

        System.out.println("Number c");
        c.displayAll();
    }
}
