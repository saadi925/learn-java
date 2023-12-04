package basics;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        System.out.println("how many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        System.out.println("Rate per hour ?");
       double rate = scanner.nextDouble();
       scanner.close();
       double payRate = rate * hours;
       System.out.println("Pay rate per hour" + payRate);

    }

}
