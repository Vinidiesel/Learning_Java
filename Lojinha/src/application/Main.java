package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.println("Enter the number of products: ");
        int numberProducts = sc.nextInt();
        for (int i = 1; i <= numberProducts; i++) {
            System.out.println("Product #"+i+" data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (ch == 'c'){
                products.add(new Product(name,price));
            }
            if (ch == 'i'){
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                products.add(new ImportedProduct(name,price,customsFee));
            }
            if (ch == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf1.parse(sc.next());
                products.add(new UsedProduct(name,price,manufactureDate));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product product: products) {
            System.out.println(product.priceTag());
        }

    }
}