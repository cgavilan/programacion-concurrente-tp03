package AcividadObligatoria01;

public class Pasajero implements Runnable {
    private Tren tren;

    public Pasajero(Tren t) {
        this.tren = t;
    }

    @Override
    public void run() {
        while (true) {
            tren.subirPasajero();
            tren.bajarPasajero();
        }
    }

}
