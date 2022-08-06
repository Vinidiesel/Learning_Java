package Program;

import entities.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        ContaBancaria contaBancaria;

        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Is there an initial deposit (y/n)? ");
        char initialDeposit = sc.next().charAt(0);


        if(initialDeposit=='y'){
            System.out.println("Enter initial deposit value: ");
            double balance = sc.nextDouble();
            contaBancaria = new ContaBancaria(accountNumber, holder, balance);
        }else{
            contaBancaria = new ContaBancaria(accountNumber, holder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(contaBancaria);

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double amount = sc.nextDouble();
        contaBancaria.deposit(amount);
        System.out.println("Updated account data: ");
        System.out.println(contaBancaria);

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        amount = sc.nextDouble();
        contaBancaria.withdraw(amount);
        System.out.println("Updated account data: ");
        System.out.println(contaBancaria);

    }
}