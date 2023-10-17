package ejercicio04;

import java.util.concurrent.Semaphore;

public class Manager {
    private int maxPrinter = 2;
    private Printer[] printers = new Printer[maxPrinter];
    Semaphore mutex;

    public void sendDocumentToPrint(String document) {
        try {
            this.mutex.acquire();
            boolean available = false;
            for (int i = 0; i < printers.length && !available; i++) {
                if (printers[i].getAvailable()) {
                    available = true;
                    System.out.println(Thread.currentThread().getName() + " imprimiendo en la impresora " + i);
                    printers[i].print(document);
                }
            }
            if (!available) {
                System.out.println(Thread.currentThread().getName() + " no encontro impresora disponible");
            }
            this.mutex.release();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Manager() {
        for (int i = 0; i < printers.length; i++) {
            printers[i] = new Printer();
        }
        this.mutex = new Semaphore(1);
    }
}
