package Visitor;

public class OrderItemVisitorView implements OrderItemVisitor{

    @Override
    public void visit(Bread aBread) {
        System.out.println("Bread.");
    }

    @Override
    public void visit(Cheese aCheese) {
        System.out.println("Cheese.");
    }

    @Override
    public void visit(Tea aTea) {
        System.out.println("Tea.");
    }

    @Override
    public void visit(Order anOrder) {
        System.out.println("Order--->.");
    }

}