package Composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private double salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<Employee>();
    }
    public void add(Employee anEmployee){
        subordinates.add(anEmployee);
    }
    public void remove(Employee anEmployee){
        subordinates.remove(anEmployee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", dept=" + dept + ", salary=" + salary + '}';
    }
}
