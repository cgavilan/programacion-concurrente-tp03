package ejercicio07;

import java.util.Random;

public class Printer implements Runnable{
    private String character;
    private int count;
    private Order order;

    private Random rnd = new Random();

    @Override
    public void run() {
        while (true) {
            
            if (order.getOrder() == this.character) {
                for (int i = 0; i < count; i++) {
                    System.out.print(this.character);
                }
                try {
                    Thread.sleep((rnd.nextInt(10)+1)*100);
                } catch (Exception e) {
                    System.out.println(e);
                }
                if (this.character == "A") {
                    this.order.setOrder("B");
                }
                if (this.character == "B") {
                    this.order.setOrder("C");
                }
                if (this.character == "C") {
                    System.out.println("");
                    this.order.setOrder("A");
                }
            }
        }
    }

    public Printer(String character, int count, Order order) {
        this.character = character;
        this.count = count;
        this.order = order;
    }
}
