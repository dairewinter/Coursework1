public class Employee {
    private final String fullName;
    private int department;
    private int salary;
    private static int counter = 0;
    private final int id;

    public Employee (String fullName, int department, float salary){
        this.fullName = fullName;
        this.department = department;
        this.salary = (int) salary;
        this.id = ++counter;
    }
    public int getId(){
        return this.id;
    }

    public String getFullName(){
        return this.fullName;
    }

    public int getDepartment(){
        return this.department;
    }

    public int getSalary(){
        return salary;
    }

    public void setDepartment(int department){
        this.department = department;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудники" +
                "ФИО: " + fullName + '\'' +
                ", Отдел: " + department +
                ", Зарплата: " + salary +
                ", ID: " + id +
                '}';
    }
}
