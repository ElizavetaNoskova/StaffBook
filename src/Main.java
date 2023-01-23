import static java.lang.Double.MAX_VALUE;
import static java.lang.Double.MIN_VALUE;

public class Main {

    public static void main(String[] args) {
        Employee[] workers = new Employee[10];
        workers[0] = new Employee("Алексей", "Ганин", "Олегович", 2, 45000);
        workers[1] = new Employee("Максим", "Корепанов", "Владиславович", 1, 69000);
        workers[2] = new Employee("Максим", "Большаков", "Андреевич", 1, 69000);
        workers[3] = new Employee("Алена", "Верба", "Романовна", 3, 42000);
        workers[4] = new Employee("Роман", "Петров", "Александрович", 3, 12000);
        workers[5] = new Employee("Аврора", "Колобкова", "Федоровна", 1, 19000);
        workers[6] = new Employee("Александр", "Емильянов", "Романович", 5, 82000);
        workers[7] = new Employee("Елена", "Федорова", "Ильинична", 4, 92000);
        workers[8] = new Employee("Юрий", "Осипов", "Михайлович", 1, 10000);
        workers[9] = new Employee("Елизавета", "Гринева", "Юрьевна", 3, 189000);
        for (Employee employee : workers) {
            System.out.println(employee);
        }
        payrollCoasts(workers);
        minSalary(workers);
        maxSalary(workers);
        for (int i = 0; workers.length > i; i++) {
            System.out.println(workers[i].getSername() + " " + workers[i].getName() + " " + workers[i].getPatronymic());
        }

    }

    public static double payrollCoasts(Employee[] workers) {
        double sum = 0;
        for (int i = 0; i < workers.length; i++) {
            sum += workers[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц= " + sum);
        sum = sum / workers.length;
        System.out.println("Размер средней зарпалты =" + sum);
        return sum;
    }

    public static double minSalary(Employee[] workers) {
        double min = MAX_VALUE;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getSalary() < min) {
                min = workers[i].getSalary();
            }

        }
        System.out.println("Минимальная зарплата = " + min);
        return min;
    }

    public static double maxSalary(Employee[] workers) {
        double max = MIN_VALUE;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getSalary() > max) {
                max = workers[i].getSalary();
            }

        }
        System.out.println("Максимальная зарплата = " + max);
        return max;
    }
}
