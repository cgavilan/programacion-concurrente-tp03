package AcividadObligatoria01;

import java.util.concurrent.Semaphore;

public class Tren {
    private int capacidad;

    private int ocupacion;

    Semaphore subiendo;
    Semaphore bajando;
    Semaphore viajando;

    public Tren() {
        capacidad = 10;
        ocupacion = 0;
        subiendo = new Semaphore(1);
        bajando = new Semaphore(0);
        viajando = new Semaphore(0);
    }

    public void subirPasajero() {
        try {
            subiendo.acquire();

            if (ocupacion < capacidad) {
                ocupacion++;
                System.out.println("Pasajero subido: " + Thread.currentThread().getName());
                subiendo.release();
            } else {
                viajando.release();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void bajarPasajero() {

        try {
            bajando.acquire();
            if (ocupacion > 0) {
                ocupacion--;
                System.out.println("Pasajero bajando:" + Thread.currentThread().getName());
                bajando.release();
            } else {
                subiendo.release();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void empezarViaje() {
        try {
            viajando.acquire();
            System.out.println("Inicia recorrido turistico");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void terminarViaje() {
        try {
            System.out.println("viaje finalizado");
            System.out.println("------------------------------");
            bajando.release();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
