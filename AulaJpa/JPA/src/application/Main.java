import dominio.Pessoas;

public class Main {
    public static void main(String[] args) {

        Pessoas p1 = new Pessoas(1, "Carlos Santos", "carlos@gmail.com");
        Pessoas p2 = new Pessoas(2, "Vinicius Inhesta", "inhesta@gmail.com");
        Pessoas p3 = new Pessoas(3, "Nicolas Pires", "nicolas@gmail.com");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}