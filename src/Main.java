import java.util.Arrays;

import static java.util.Arrays.fill;

public class Main {
    private static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        Employee pushkin = new Employee("Пушкин Александр Сергеевич ", 1, 60000);
        Employee lermontov = new Employee("Лермонтов Михаил Юрьевич ", 1, 70000);
        Employee blok = new Employee("Блок Александр Александрович ", 2, 80000);
        Employee esenin = new Employee("Есенин Сергей Александрович ", 2, 90000);
        Employee mayakovsky = new Employee("Маяковский Владимир Владимирович ", 2, 100000);
        Employee pasternak = new Employee("Пастернак Борис Леонидович", 3, 110000);
        Employee okudjava = new Employee("Окуджава Булат Шалвович", 3, 120000);
        Employee brodskiy = new Employee("Бродский Иосиф Александрович", 3, 130000);
        Employee bykov = new Employee("Быков Дмитрий Львович", 4, 140000);
        Employee morgenstern = new Employee("Моргенштерн Алишер Тагирович", 5, 1000000);
        employees[0] = pushkin;
        employees[1] = lermontov;
        employees[2] = blok;
        employees[3] = esenin;
        employees[4] = mayakovsky;
        employees[5] = pasternak;
        employees[6] = okudjava;
        employees[7] = brodskiy;
        employees[8] = bykov;
        employees[9] = morgenstern;
        System.out.println("Полная информация о сотрудниках : " + getAllEmployee());
        System.out.println("Cотрудник с минимальной зарплатой - " + findMinSalary());
        System.out.println("Cотрудник с максимальной зарплатой - " + findMaxSalary());
        System.out.println("Средняя зарплата по компании - " + getAverageSalary());
        System.out.println("Список всех имен в компании : " + getFioEmployee());
        System.out.println("Сумма всех зарплат : " + getSumSalary());
    }
    public static String getAllEmployee(){
        Employee list[] = new Employee[employees.length];
        for (int i = 0; i < employees.length; i++){
            list[i] = employees[i];
        }
        return Arrays.toString(list);
    }
    public static Employee findMinSalary() {
        Employee findMinSalary = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < findMinSalary.getSalary()) {
                findMinSalary = employees[i];
            }
        }
        return findMinSalary;
    }
    public static Employee findMaxSalary() {
        Employee findMaxSalary = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > findMaxSalary.getSalary()) {
                findMaxSalary = employees[i];
            }
        }
        return findMaxSalary;
    }
    public static String getFioEmployee(){
        String[] listOfName = new String[employees.length];
        for (int i = 0; i < employees.length; i++){
            listOfName[i] = employees[i].getName();

        }
        return Arrays.toString(listOfName);
    }
    public static float getAverageSalary(){
        int count = 0;
        count = getSumSalary() / employees.length;
        return count;
    }
    public static int getSumSalary(){
        int count = 0;
        for (int i = 0; i < employees.length; i++){
            count += employees[i].getSalary();
        }
        return count;
    }

}