package ejercicio07;

public class Order {
    private String order;

    public synchronized String getOrder() {
        return order;
    }
    public synchronized void setOrder(String order) {
        this.order = order;
    }

    public Order(String order) {
        this.order = order;
    }
}
