class Employee {
    private String name;
    private String address;
    private double salary;
    private String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.05;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, String address, double salary, String department) {
        super(name, address, salary, "Manager");
        this.department = department;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.10;
    }

    public String getDepartment() {
        return department;
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String address, double salary, String programmingLanguage) {
        super(name, address, salary, "Developer");
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}

class Programmer extends Developer {
    private int linesOfCode;

    public Programmer(String name, String address, double salary, String programmingLanguage, int linesOfCode) {
        super(name, address, salary, programmingLanguage);
        this.linesOfCode = linesOfCode;
    }

    @Override
    public double calculateBonus() {
        return super.calculateBonus() + (linesOfCode * 0.01);
    }

    public int getLinesOfCode() {
        return linesOfCode;
    }
}

public class Company {
    public static void main(String[] args) {
        Employee emp = new Employee("John", "123 Main St", 50000, "Staff");
        Manager mgr = new Manager("Alice", "456 Oak Ave", 80000, "HR");
        Developer dev = new Developer("Bob", "789 Pine Rd", 60000, "Java");
        Programmer prog = new Programmer("Eve", "321 Elm Blvd", 70000, "Python", 15000);

        System.out.println(emp.getName() + "'s bonus: $" + emp.calculateBonus());
        System.out.println(mgr.getName() + "'s bonus: $" + mgr.calculateBonus());
        System.out.println(dev.getName() + "'s bonus: $" + dev.calculateBonus());
        System.out.println(prog.getName() + "'s bonus: $" + prog.calculateBonus());
    }
}