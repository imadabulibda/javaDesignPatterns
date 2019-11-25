package Visitor;

public class Order implements OrderItem {
    private OrderItem[] items;

    public Order() {
        items = new OrderItem[]{new Bread(), new Cheese(), new Tea()};
    }

    @Override
    public void accept(OrderItemVisitor anItemVisitor) {
        anItemVisitor.visit(this);
        for (OrderItem orderItem : items)
            orderItem.accept(anItemVisitor);
    }
}
