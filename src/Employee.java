import static java.lang.Double.MAX_VALUE;

public class Employee {
    private String name;
    private String sername;
    private String patronymic;
    private int department;
    private float salary;
    private int id;
    private static int counter = 0;

    public String getName() {
        return name;
    }

    public String getSername() {
        return sername;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Employee(String name, String sername, String patronymic, int department, float salary){
        this.name = name;
        this.sername = sername;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        id= ++counter;
    }


    @Override
    public String toString() {
        return "ID:"+ id +", Имя "+ name +", Фамилия "+ sername +", Отчество " + patronymic+ ", Отдел: " +department + ", Зарплата: "+ salary;
    }
}
