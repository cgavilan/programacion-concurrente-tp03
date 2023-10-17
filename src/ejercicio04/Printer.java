package ejercicio04;

import java.util.concurrent.Semaphore;

public class Printer {
    private boolean available;
    Semaphore mutex;

    public boolean getAvailable() {
        return this.available;
    }

    // public void setAvailable(boolean value) {
    // this.available = value;
    // }

    public void print(String document) {
        try {
            this.mutex.acquire();
            this.available = false;
            System.out.println(document);
            Thread.sleep(2000);
            this.available = true;
            this.mutex.release();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Printer() {
        this.available = true;
        this.mutex = new Semaphore(1);
    }
}
