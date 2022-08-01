import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];
        int a = 1;
        for(int i = 0; i<nome.length; i++){
            sc.nextLine();
            System.out.println("Dados da "+a+"a pessoa: ");
            System.out.println("Nome: ");
            nome[i]=sc.nextLine();
            System.out.println("Idade: ");
            idade[i]=sc.nextInt();
            System.out.println("Altura: ");
            altura[i]=sc.nextDouble();
            a++;
        }
        double somaAltura = 0;
        for(int i = 0; i<altura.length; i++){
            somaAltura+=altura[i];
        }
        double mediaAltura = somaAltura/altura.length;

        double menorIdade = 0;
        for(int i = 0; i<idade.length; i++){
            if(idade[i]<16){
                menorIdade++;
            }
        }
        double porcentagemMenorIdade = (menorIdade/n)*100;
        System.out.println("Altura media: "+ mediaAltura);
        System.out.println("Pessoas com menos de 16 anos: "+ porcentagemMenorIdade +"%");
        for(int i = 0; i<idade.length;i++){
            if (idade[i]<16){
                System.out.println(nome[i]);
            }
        }
    }
}