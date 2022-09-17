package application;

import model.entities.Product;
import model.services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductService service = new ProductService();

        double sum = service.filteredSum(list, product -> product.getName().charAt(0) == 'T');

        System.out.println("Sum = " + String.format("%.2f",sum));
    }
}