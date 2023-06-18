public class Main {
    public static void main(String[] args) {
        Employee[] Employee = new Employee[5];
        Employee Sarah = new Employee("Sarah", "S", "K", 1, 40000);
        Employee Sasha = new Employee("Sasha", "R", "G", 2, 25000);
        Employee Igor = new Employee("Igor", "A", "K", 2, 32000);
        Employee Alice = new Employee("Alice", "F", "C", 4, 21000);
        Employee Katy = new Employee("Katy", "T", "D", 5, 41000);
        Employee[0] = Sarah;
        Employee[1] = Sasha;
        Employee[2] = Igor;
        Employee[3] = Alice;
        Employee[4] = Katy;


        Alice.setSalary(30000);
        Katy.setSalary(38000);
        Igor.setDivision(3);

        for (int i = 0; i < Employee.length; i++) {
            System.out.println(Employee[i]);
        }

        int sumSalary = Sarah.getSalary() + Sasha.getSalary() + Igor.getSalary() + Alice.getSalary() + Katy.getSalary();
        System.out.println("Сумма затрат на зарплаты в месяц = " + sumSalary);

        int maxSalary = 0;

        if (maxSalary < Sarah.getSalary()) {
            maxSalary = Sarah.getSalary();
        } if (maxSalary < Sasha.getSalary()) {
            maxSalary = Sasha.getSalary();
        } if (maxSalary < Igor.getSalary()) {
            maxSalary = Igor.getSalary();
        } if (maxSalary < Alice.getSalary()) {
            maxSalary = Alice.getSalary();
        } if (maxSalary < Katy.getSalary()) {
            maxSalary = Katy.getSalary();
        }
        System.out.println("Максимальная зарплата сотрудников = " + maxSalary);

        int minSalary = 1_000_000;

        if (minSalary > Sarah.getSalary()) {
            minSalary = Sarah.getSalary();
        } if (minSalary > Sasha.getSalary()) {
            minSalary = Sasha.getSalary();
        } if (minSalary > Igor.getSalary()) {
            minSalary = Igor.getSalary();
        } if (minSalary > Alice.getSalary()) {
            minSalary = Alice.getSalary();
        } if (minSalary > Katy.getSalary()) {
            minSalary = Katy.getSalary();
        }
        System.out.println("Минимальная зарплата сотрудников = " + minSalary);

        int averageSalary = sumSalary / Employee.length;
        System.out.println("Среднее значение зарплат = " + averageSalary);
    }
}