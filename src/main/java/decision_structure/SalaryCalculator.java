package decision_structure;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        double salary = 1000;
        double bonus = 100;
        int quota = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sales did the employee get this week?");
        int sales = scanner.nextInt();
        scanner.close();
//         could use nested and if else too . but i am lazy now.
        if (sales > quota) salary = salary + bonus;
        System.out.println("Salary for the employee is : " + salary);
    }
}
