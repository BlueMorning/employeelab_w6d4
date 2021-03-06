package staff;

public class Employee {

    private String name;
    private int niNumber;
    protected int salary;


    public Employee(String name, int niNumber, int salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getNiNumber() {
        return this.niNumber;
    }

    public int getSalary() {
        return this.salary;
    }

    public int raiseSalary(Double percentage) {
        if (percentage > 0) {
            this.salary = (int)(this.salary * (1 + percentage));
        }
        return this.salary;
    }


    public Double payBonus() {
        return 0.01 * this.salary;
    }

    public void setName(String name) {
        if(name != null) {
            this.name = name;
        }
    }
}
