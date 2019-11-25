package Composite;

public class CompositeApp {
    public static void main(String[] args) {
        Employee manager = new Employee("Hatem", "CEO", 2200.0);
        Employee headSales = new Employee("Ahmad", "Head Sales", 1000);
        Employee salesPerson1 = new Employee("Hamada", "Sales", 700);
        Employee salesPerson2 = new Employee("Hamed", "Sales", 720.11);
        headSales.add(salesPerson1);
        headSales.add(salesPerson2);

        Employee headMarketing = new Employee("Sami", "Head Marketing", 1200);
        Employee marketingPerson1 = new Employee("Somaya", "Marketing", 800);
        Employee marketingPerson2 = new Employee("Soso", "Marketing", 800.44);
        headMarketing.add(marketingPerson1);
        headMarketing.add(marketingPerson2);

        manager.add(headSales);
        manager.add(headMarketing);

        System.out.println(manager);
        for(Employee headEmployee: manager.getSubordinates()){
            System.out.println(headEmployee);
            for(Employee employee: headEmployee.getSubordinates()){
                System.out.println(employee);
            }
        }
    }
}
