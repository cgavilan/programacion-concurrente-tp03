package ejercicio01;

public class CuentaBanco {
    private int balance = 50;

    public CuentaBanco() {
    }

    public synchronized int getBalance() {
        return balance;
    }

    public synchronized boolean retiroBancario(int retiro) {
        if (this.getBalance() >= retiro) {
            balance = balance - retiro;
            return true;
        } else {
            return false;
        }
    }
}
