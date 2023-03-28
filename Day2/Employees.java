import java.util.*;

class Employee {
    private String name;
    private int id;
    private double salary;

    Employee(int id, String name, double salary) {
        setid(id);
        setName(name);
        setSalary(salary);
    }

    void setName(String name) {
        this.name = name;
    }

    void setid(int id) {
        this.id = id;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    String getName() {
        return name;
    }

    int getid() {
        return id;
    }

    double getSalary() {
        return salary;
    }
}

public class Employees {
    public static void main(String[] ars) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> emp = new ArrayList<Employee>();

        for (int i = 0; i < 5; i++) {
            emp.add(new Employee(sc.nextInt(), sc.next(), sc.nextDouble()));
        }

        for (Employee em : emp) {
            System.out.println(em.getid() + " " + em.getName() + " " + em.getSalary());
        }
    }
}