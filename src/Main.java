public class Main {

    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.indexSalaries(10);
        storage.printAllEmployees();
        System.out.println("==========================================================");
        System.out.println("Сумма всех зарплат " + storage.calculateAllSalaries());
        System.out.println("==========================================================");
        System.out.println("Самый бедный " + storage.findPoorEmployee());
        System.out.println("==========================================================");
        System.out.println("Самый богатый " + storage.findBestEmployee());
        System.out.println("==========================================================");
        System.out.println("Средняя зарплата " + storage.calculateAverageSalaries());
        System.out.println("==========================================================");
        storage.printFullNameEmployee();
        System.out.println("==========================================================");
    }
}