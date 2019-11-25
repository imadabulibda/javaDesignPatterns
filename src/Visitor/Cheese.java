package Visitor;

public class Cheese implements OrderItem{

    @Override
    public void accept(OrderItemVisitor anItemVisitor) {
        anItemVisitor.visit(this);
    }
}
