package ejercicio03;

import java.util.concurrent.Semaphore;

public class Cage {
    Semaphore foodDish = new Semaphore(1);
    Semaphore wheel = new Semaphore(1);
    Semaphore hammock = new Semaphore(1);

    public Cage() {
    }
}
