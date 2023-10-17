package ejercicio04;

public class User implements Runnable {
    private Manager manager;

    @Override
    public void run() {
        while (true) {
            manager.sendDocumentToPrint("document of " + Thread.currentThread().getName());
        }
    }

    public User(Manager manager) {
        this.manager = manager;
    }
}
