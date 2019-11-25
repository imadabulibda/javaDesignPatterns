package Visitor;

public class VisitorApp {
    public static void main(String[] args) {
        OrderItem order = new Order();
        order.accept(new OrderItemVisitorView());
    }
}
