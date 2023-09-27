package ejercicio03;

import java.util.Random;

public class Hamster implements Runnable {
    private Cage cage;
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    @Override
    public void run() {
        Random rnd = new Random();
        while (true) {
            try {
                if (cage.foodDish.tryAcquire()) {
                    System.out
                            .println(ANSI_YELLOW + Thread.currentThread().getName() + " --> entra al plato de comida");
                    Thread.sleep(100 * (rnd.nextInt(10) + 1));
                    System.out
                            .println(ANSI_YELLOW + Thread.currentThread().getName() + " <-- sale del plato de comida");
                    cage.foodDish.release();
                }

                if (cage.wheel.tryAcquire()) {
                    System.out.println(
                            ANSI_GREEN + Thread.currentThread().getName() + " --> entra a la rueda de ejercicios");
                    Thread.sleep(100 * (rnd.nextInt(10) + 1));
                    System.out.println(
                            ANSI_GREEN + Thread.currentThread().getName() + " <-- sale de la rueda de ejercicios");
                    cage.wheel.release();
                }

                if (cage.hammock.tryAcquire()) {
                    System.out.println(ANSI_RED + Thread.currentThread().getName() + " --> entra en la hamaca");
                    Thread.sleep(100 * (rnd.nextInt(10) + 1));
                    System.out.println(ANSI_RED + Thread.currentThread().getName() + " <-- sale de la hamaca");
                    cage.hammock.release();
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public Hamster(Cage cage) {
        this.cage = cage;
    }
}
