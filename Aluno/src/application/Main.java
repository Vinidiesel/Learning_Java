package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

import static java.sql.Types.NULL;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.println("Name:");
        student.name=sc.nextLine();
        System.out.println("First Note: ");
        student.first=sc.nextDouble();
        System.out.println("Second Note: ");
        student.second=sc.nextDouble();
        System.out.println("Third Note: ");
        student.third=sc.nextDouble();

        student.approved();

        System.out.println("FINAL GRADE = "+student.finalGrade);
        System.out.println(student.approved);
        if(student.missing!=NULL){
            System.out.println("MISSING "+student.missing+" POINTS");
        }
    }
}