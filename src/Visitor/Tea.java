package Visitor;

public class Tea implements OrderItem{

    @Override
    public void accept(OrderItemVisitor anItemVisitor) {
        anItemVisitor.visit(this);
    }
}
