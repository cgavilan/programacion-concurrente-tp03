package AcividadObligatoria01;

public class CtrolTren implements Runnable {

    private Tren tren;

    public CtrolTren(Tren t) {
        this.tren = t;
    }

    public void run() {
        while (true) {
            tren.empezarViaje();
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e);
            }
            tren.terminarViaje();
        }
    }
}
