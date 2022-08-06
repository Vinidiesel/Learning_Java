package application;

import entities.Funcionarios;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();
        System.out.println();

        List<Funcionarios> list = new ArrayList<>();

        for (int i=1; i<=n; i++){
            sc.nextLine();
            System.out.println("Employee #"+i+":");
            System.out.println("Id: ");
            int id = sc.nextInt();
            while(hasId(list, id)){
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Salary: ");
            Double salary = sc.nextDouble();
            list.add(new Funcionarios(id, name, salary));
        }

        System.out.println();
        System.out.println("Enter the employee id that will have salary increase : ");
        int id = sc.nextInt();
        Funcionarios emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(emp == null){
            System.out.println("This id does not exist! ");
        }else {
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Funcionarios obj : list) {
            System.out.println(obj);
        }

    }



    public static boolean hasId(List<Funcionarios> list, int id){
        Funcionarios emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}