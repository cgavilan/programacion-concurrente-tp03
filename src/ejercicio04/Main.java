package ejercicio04;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        User user = new User(manager);

        Thread tu01 = new Thread(user, "Carlos");
        Thread tu02 = new Thread(user, "Maria");
        Thread tu03 = new Thread(user, "Jose");

        tu01.start();
        tu02.start();
        tu03.start();
    }
}
