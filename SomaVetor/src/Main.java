import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect= new double[n];

        for(int i = 0; i<vect.length;i++){
            sc.nextLine();
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        double soma = 0;
        System.out.print("VALORES = ");
        for(int i = 0; i<vect.length;i++){
            System.out.print(" "+vect[i]);
            soma+=vect[i];
        }
        System.out.println();
        double avg = soma/ vect.length;
        System.out.println("SOMA = "+ soma);
        System.out.println("MEDIA = "+ avg);
    }
}