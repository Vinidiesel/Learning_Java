package application;

import Entities.Legal;
import Entities.Natural;
import Entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Person> list = new ArrayList<>();

        System.out.println("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #"+ i +" data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();
            if (ch =='i'){
                System.out.print("Health expenditures: ");
                double healthExpenses = sc.nextDouble();
                list.add(new Natural(name,annualIncome,healthExpenses));
            }else {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                list.add(new Legal(name,annualIncome,employees));
            }
        }


        System.out.println();
        double soma = 0;
        System.out.println("TAXES PAID:");
        for (Person person: list) {
            System.out.println(person.getNome()+": $ "+String.format("%.2f",person.taxCalculation()));
            soma += person.taxCalculation();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ "+soma);
    }
}