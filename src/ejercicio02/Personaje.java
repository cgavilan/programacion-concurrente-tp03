package ejercicio02;

public class Personaje implements Runnable {
    private Energia energia;
    private int value;

    @Override
    public void run() {
        while (true) {
            this.energia.alterarEnergia(Thread.currentThread().getName(), this.value);
        }
    }

    public Personaje(int value, Energia energia) {
        this.value = value;
        this.energia = energia;
    }

}
