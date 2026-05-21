class Employee {
    private final String name;
    protected final int baseSalary;

    Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    int calcSalary() { return this.baseSalary; }
    void printSalary() { System.out.println(this.name + "の給与: " + this.calcSalary() + "円"); }
}

class Manager extends Employee {
    private final int allowance;

    Manager(String name, int baseSalary, int allowance) {
        super(name, baseSalary);
        this.allowance = allowance;
    }

    int calcSalary() { return this.baseSalary + this.allowance; }
}

class PartTimer extends Employee {
    private final int hourlyWage;
    private final int hoursWorked;

    PartTimer(String name, int hourlyWage, int hoursWorked) {
        super(name, 0);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    int calcSalary() { return this.hourlyWage * this.hoursWorked; }
}

public class Ex2Employee {
    public static void main(String[] args) {
        Employee employee  = new Employee("田中", 250000);
        Manager manager    = new Manager("鈴木", 300000, 50000);
        PartTimer partTime = new PartTimer("佐藤", 1200, 80);

        employee.printSalary();
        manager.printSalary();
        partTime.printSalary();
    }
}