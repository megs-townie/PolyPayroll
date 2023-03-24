import java.util.ArrayList;

abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateMonthlyPay();

    public String getPayType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}

class CommissionedEmployee extends Employee {
    private double grossSales;

    public CommissionedEmployee(String name, double grossSales) {
        super(name);
        this.grossSales = grossSales;
    }

    @Override
    public double calculateMonthlyPay() {
        return 2000 + 0.1 * grossSales;
    }
}

class SalariedEmployee extends Employee {
    private int yearsOfService;

    public SalariedEmployee(String name, int yearsOfService) {
        super(name);
        this.yearsOfService = yearsOfService;
    }

    @Override
    public double calculateMonthlyPay() {
        return (50000 + 0.01 * yearsOfService) / 12;
    }
}

class PieceWorkerEmployee extends Employee {
    private int producedUnits;

    public PieceWorkerEmployee(String name, int producedUnits) {
        super(name);
        this.producedUnits = producedUnits;
    }

    @Override
    public double calculateMonthlyPay() {
        return producedUnits * 1;
    }
}

class ManagerEmployee extends Employee {
    private double monthlyBaseSalary;
    private double monthlyBonus;

    public ManagerEmployee(String name, double monthlyBonus) {
        super(name);
        this.monthlyBaseSalary = 100000.0 / 12;
        this.monthlyBonus = monthlyBonus;
    }

    @Override
    public double calculateMonthlyPay() {
        return monthlyBaseSalary + monthlyBonus;
    }
}