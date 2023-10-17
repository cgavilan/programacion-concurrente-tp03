package AcividadObligatoria01;

public class Main {
    public static void main(String[] args) {
        Tren t = new Tren();
        Pasajero p = new Pasajero(t);
        CtrolTren ct = new CtrolTren(t);
        Thread tct = new Thread(ct, "Control Tren");
        tct.start();

        Thread[] pasajeros = new Thread[50];
        for (int i = 0; i < pasajeros.length; i++) {
            pasajeros[i] = new Thread(p, "pasajero" + i);
            pasajeros[i].start();

        }

    }
}
