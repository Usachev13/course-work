public class Main {
    static Employee[] employees = new Employee[10];
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
        getAllEmployee();
        getMinAndMaxSalary();
        getAverageSalary();
        getFioEmployee();
    }
    static void getAllEmployee(){
        for (int i = 0; i < employees.length; i++){
            System.out.println(employees[i]);
        }
    }
    static void getMinAndMaxSalary(){
        int min = employees[0].salary;
        int max = employees[0].salary;
        for (int i = 0; i < employees.length; i++){
            if (employees[i].salary < min){
                min = employees[i].salary;
            } else if (employees[i].salary > max) {
                max = employees[i].salary;
            }
        }
        System.out.println("Самая маленькая зарплата - " + min);
        System.out.println("Самая большая зарплата - " + max);
    }
    static void getAverageSalary(){
        int count = 0;
        for (int i = 0; i < employees.length; i++){
            count += employees[i].salary;
        }
        count = count / employees.length;
        System.out.println("Средняя зарплата - " + count);
    }
    static void getFioEmployee(){
        for (int i = 0; i < employees.length; i++){
            System.out.println(employees[i].name);
        }
    }
}