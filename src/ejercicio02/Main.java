package ejercicio02;

public class Main {
    public static void main(String[] args) {
        Energia nrg = new Energia();
        Personaje personaje1 = new Personaje(-3, nrg);
        Personaje personaje2 = new Personaje(3, nrg);

        Thread hilo1 = new Thread(personaje1, "La Criatura Oscura");
        Thread hilo2 = new Thread(personaje2, "El Sanador");

        hilo1.start();
        hilo2.start();
    }

}
