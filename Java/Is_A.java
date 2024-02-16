class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    private int id;
    private double salary;

    public Employee(int id, double salary, String name, int age) {
        super(name, age);
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id "+id+" salary "+salary+" name "+name+" age "+age;
    }
}

public class Is_A {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1046, 35000, "John", 22);
        Employee emp2 = new Employee(1047, 40000, "Rajesh", 27);

        System.out.println(emp1);
        System.out.println(emp2);
    }
}
