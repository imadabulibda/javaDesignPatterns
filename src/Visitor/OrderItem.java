package Visitor;

public interface OrderItem {
    public void accept(OrderItemVisitor anItemVisitor);

}
