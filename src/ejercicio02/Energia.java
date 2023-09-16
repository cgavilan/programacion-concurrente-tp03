package ejercicio02;

public class Energia {
    private int _unidades;

    public synchronized void alterarEnergia(String personaje, int cantidad) {
        System.out.println(personaje + ", cuando la energia es: " + this._unidades);
        if (_unidades + cantidad >= 0) {
            this._unidades += cantidad;
            System.out.println(personaje + ", deja la energia en: " + this._unidades);
        } else {
            System.out.println(personaje + " no pudo alterar la energia");
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("--------------------------------------");

    }

    public Energia() {
        this._unidades = 10;
    }

}
