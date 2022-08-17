package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
    private Date moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> orders = new ArrayList<>();

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrders() {
        return orders;
    }

    public void addItem(OrderItem order){
        orders.add(order);
    }
    public void removeItem(OrderItem order){
        orders.remove(order);
    }

    public Double total(){
        double soma = 0;
        for (OrderItem c: orders){
            soma+= c.subTotal();
        }
        return soma;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY:").append("\n");
        sb.append("Order moment: ").append(sdf.format(moment)).append("\n");
        sb.append("Order status: ").append(status).append("\n");
        sb.append("Client: ").append(client.getName()).append(" (").append(sdf1.format(client.getBirthDate())).append(")").append(" - ").append(client.getEmail()).append("\n");
        sb.append("Order items: ").append("\n");
        for ( OrderItem c: orders){
            sb.append(c.getProduct().getName()).append(", $").append(c.getPrice()).append(", Quantity: ").append(c.getQuantity()).append(", Subtotal: $").append(c.subTotal()).append("\n");
        }
        sb.append("Total Price: $").append(total());
        return sb.toString();
    }
}
