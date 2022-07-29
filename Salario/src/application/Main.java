package application;

import entities.Salary;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Salary salary = new Salary();
        System.out.println("Name: ");
        salary.name = sc.nextLine();
        System.out.println("Gross salary: ");
        salary.grossSalary=sc.nextDouble();
        System.out.println("Tax: ");
        salary.tax=sc.nextDouble();

        System.out.println(salary);

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        salary.increaseSalary(percentage);

        System.out.println(salary);
    }
}