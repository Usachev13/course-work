public class Employee {
    private String name;
    private int department;
    private int salary;
    private int id;

    public static int idCounter = 0;

    public Employee(String name, int department, int salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = idCounter;
        idCounter++;
    }
}
