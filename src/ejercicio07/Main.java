package ejercicio07;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("A");
        Printer pA = new Printer("A", 1, order);
        Printer pB = new Printer("B", 2, order);
        Printer pC = new Printer("C", 3, order);

        Thread tA = new Thread(pA);
        Thread tB = new Thread(pB);
        Thread tC = new Thread(pC);

        tB.start();
        tC.start();
        tA.start();
    }
}
