package one.digitalinnovation.oo;

public class Main {
    public static void main(String[] args) {

        ola ola1 = new ola();

        ola1.setCor("azul");
        ola1.setModelo("BMW Série 3");
        ola1.setCapacidadeTanque(59);

        System.out.println(ola1.getModelo());
        System.out.println(ola1.getCor());
        System.out.println(ola1.getCapacidadeTanque());
        System.out.println(ola1.totalValorTanque(6.39));


        ola ola2 = new ola("Cinza", "Mercedes-Benz Classe C", 66);

        System.out.println(ola2.getModelo());
        System.out.println(ola2.getCor());
        System.out.println(ola2.getCapacidadeTanque());
        System.out.println(ola1.totalValorTanque(6.46));


    }

}