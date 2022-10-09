import java.util.Arrays;

public class Main {

    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Середа Виктор Данилович", 1, 3500);
        employees[1] = new Employee("Козелков Павел Кондратьевич", 2, 4303);
        employees[2] = new Employee("Козелкова Ирина Кондратьевна", 2, 5407);
        employees[3] = new Employee("Панферова Екатерина Сергеевна", 3, 7004);
        employees[4] = new Employee("Сорокина Юлия Алексеевна", 3, 7605);
        employees[5] = new Employee("Кутейщикова Варвара Николаевна", 4, 6605);
        employees[6] = new Employee("Копаныгин Михаил Васильевич", 4, 6909);
        employees[7] = new Employee("Курочкин Александр Иванович", 5, 3208);
        employees[8] = new Employee("Филатов Сергей Сергеевич", 5, 3503);
        employees[9] = new Employee("Окорокова Людмила Владимировна", 5, 2305);
        allEmployees();
        employeesFullName();
        System.out.println("Сумма всех зарплат: " + sumSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " + withMaxSalary());
        System.out.println("Сотрудник с минимальной зарплатой: " + withMinSalary());
        System.out.println("Средняя зарплата сотрудников: " + employeesAverageSalary());

    }

    public static void allEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static void employeesFullName(){
        for(Employee employee : employees){
            if (employee != null){
                System.out.println(employee.getFullName());
            }
        }

    }

    public static int sumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee withMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public static Employee withMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee minSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static double employeesAverageSalary() {
        int count = 0;
        double sum = sumSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null){
                count++;
        }
        }
        return sum / count;
    }
}

