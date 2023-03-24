import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new CommissionedEmployee("Bob Loblaw", 40000));
        employees.add(new SalariedEmployee("Sue Me", 10));
        employees.add(new PieceWorkerEmployee("Tina Zena", 1000));
        employees.add(new ManagerEmployee("Richard Rich", 2000));

        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println("           Pay Type: " + employee.getPayType());
            System.out.println("           Monthly Pay: $" + String.format("%.2f", employee.calculateMonthlyPay()));
            System.out.println();
        }
    }
}