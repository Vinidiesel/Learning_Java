package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Email of people whose salary is more than: ");
            double sgt = sc.nextDouble();

            List<String> email = list.stream()
                    .filter(employee -> employee.getSalary() > sgt)
                    .map(Employee::getEmail)
                    .sorted(Comparator.comparing(String::toUpperCase))
                    .toList();
            email.forEach(System.out::println);

            double avg = list.stream()
                    .filter(employee -> employee.getName().charAt(0) == 'M')
                    .map(Employee::getSalary)
                    .reduce( 0.0, Double::sum);
            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f",avg));

        }catch (IOException e){
            System.out.println("Error: " + e);
        }
    }
}