package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import javax.lang.model.element.Name;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        LocalDateTime d01 = LocalDateTime.now();

        System.out.println("Enter cliente data: ");
        System.out.println("Name: ");
        String clientName = sc.nextLine();
        System.out.println("Email: ");
        String clientEmail = sc.nextLine();
        System.out.println("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        Date moment = sdf1.parse(String.valueOf(d01));
        Client client = new Client(clientName,clientEmail,birthDate);

        System.out.println("Enter order data: ");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        Order order = new Order(new Date(),status,client);
        System.out.println("How many items to this order? ");
        int n = sc.nextInt();

        for (int i=1;i<=n;i++){
            System.out.println("Enter #"+i+" item data: ");
            System.out.println("Product name: ");
            String productName = sc.nextLine();
            System.out.println("Product price: ");
            double productPrice = sc.nextDouble();
            Product product = new Product(productName,productPrice);
            System.out.println("Quantity: ");
            int productQuantity = sc.nextInt();
            OrderItem orderItem = new OrderItem(productQuantity,product.getPrice(),product);

        }

    }
}