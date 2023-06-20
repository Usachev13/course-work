public class Employee {
    public String name;
    private int department;
    public int salary;
    private int id;

    public static int idCounter = 0;

    public Employee(String name, int department, int salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = idCounter;
        idCounter++;
    }
    public String getName() {
        return this.name;
    }

    public int getDepartment() {

        return this.department;
    }

    public int getSalary() {

        return this.getSalary();
    }

    public void setName(String name){
        this.name = name;
    }
    public void setDepartment(int department){
        this.department = department;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public String toString() {
        return "Ф.И.О. - " + this.name + "; " +
                "Департамент - " + this.department + "; " +
                "Зарплата - " + this.salary +"; ";
    }

}
