public class Storage {

    private final Employee[] employees = new Employee[10];

    public Storage() {


        employees[0] = new Employee("Sarah", "S", "K", 1, 40000);
        employees[1] = new Employee("Sasha", "R", "G", 2, 35000);
        employees[2] = new Employee("Igor", "A", "K", 2, 32000);
        employees[3] = new Employee("Alice", "F", "C", 4, 56000);
        employees[4] = new Employee("Katy", "T", "D", 5, 41000);
        employees[5] = new Employee("Artem", "R", "E", 1, 46000);
        employees[6] = new Employee("Artur", "Q", "G", 5, 51000);
        employees[7] = new Employee("Rita", "A", "D", 2, 64000);
        employees[8] = new Employee("Max", "T", "S", 5, 34000);
        employees[9] = new Employee("Kiril", "B", "A", 3, 74000);

    }

    public void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public double calculateAllSalaries() {
        double salaries = 0;
        for (Employee employee : employees) {
            salaries += employee.getSalary();

        }
        return salaries;
    }

    public Employee findPoorEmployee() {
        Employee poorEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < poorEmployee.getSalary()) {
                poorEmployee = employee;
            }
        }
        return poorEmployee;
    }

    public Employee findBestEmployee() {
        Employee bestEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > bestEmployee.getSalary()) {
                bestEmployee = employee;
            }
        }
        return bestEmployee;
    }

    public double calculateAverageSalaries() {
        return  calculateAllSalaries() / employees.length;
    }

    public void printFullNameEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }

    }
}
