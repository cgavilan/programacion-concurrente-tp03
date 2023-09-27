package ejercicio03;

public class Main {

    public static void main(String[] args) {

        Cage cage = new Cage();
        Hamster h1 = new Hamster(cage);

        Thread th1 = new Thread(h1, "Raul");
        Thread th2 = new Thread(h1, "Romina");
        Thread th3 = new Thread(h1, "Zeus");
        Thread th4 = new Thread(h1, "Hugo");
        Thread th5 = new Thread(h1, "Enzo");

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
    }
}
