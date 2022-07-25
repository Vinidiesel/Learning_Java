public class Main {
    public static void main(String[] args) {

        Funcionario[] classes = new Funcionario[]{new Gerente(), new Vendedor(), new Funcionario()};

        for (Funcionario classe: classes){
            classe.metodo1();
        }

        System.out.println("");

        for (Funcionario classe: classes){
            classe.metodo2();
        }

        System.out.println("");

        Vendedor vendedor = new Vendedor();
        vendedor.metodo2();

    }
}