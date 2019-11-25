package Visitor;

public interface OrderItemVisitor {
    public void visit(Bread aBread);
    public void visit(Cheese aCheese);
    public void visit(Tea aTea);
    public void visit(Order anOrder);
}
