package application;

import model.Account;
import model.exceptions.DomainExceptions;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.println();

            System.out.print("Enter amount for withdraw: ");
            Double amount = sc.nextDouble();
            account.withdraw(amount);
            System.out.print("New balance: " + account.getBalance());

        }catch (DomainExceptions e){
            System.out.println("Withdraw error: "+e.getMessage());

        }catch (RuntimeException e){
            System.out.println();
            System.out.println("Unexpect error");

        }
    }
}