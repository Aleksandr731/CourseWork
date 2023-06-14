public class Employee {
    private String name;
    private String surname;
    private String patronymic;
    private int division;
    private int salary;
    private int id;
    private static int idCounter = 0;

    public Employee(String name, String surname, String patronymic, int division, int salary) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.division = division;
        this.salary = salary;
        this.id = idCounter;
        idCounter++;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public int getDivision() {
        return this.division;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public void setSalary(int salary) { this.salary = salary; }
    public String toString() {
        return "Сотрудник: " + this.name + " "
                + this.surname + " " + this.patronymic + ", работает в отделе: " + this.division +
                ", получает зарплату " + this.salary + ". id сотрудника: " + this.id;

    }
}
