import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i=0;i < vect.length;i++){
            sc.nextLine();
            System.out.println("Digite um numero:");
            vect[i]= sc.nextDouble();
        }
        System.out.println("NUMEROS NEGATIVOS: ");
        for(int i=0;i < vect.length;i++){
            if(vect[i]<0){
                System.out.println(vect[i]);
            }
        }
    }
}