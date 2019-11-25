package Visitor;

public class Bread implements OrderItem{

    @Override
    public void accept(OrderItemVisitor anItemVisitor) {
        anItemVisitor.visit(this);
    }

}
