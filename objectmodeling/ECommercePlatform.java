package com.bridgelabz.objectmodeling;



import java.util.ArrayList;
import java.util.List;

// Product class (Aggregation: Products exist independently)
class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

// Order class (Aggregation: Order HAS Products)
class Order {
    private int orderId;
    private List<Product> products; // Aggregation: Order contains multiple Products
    private EcommerceCustomer customer;

    public Order(int orderId, EcommerceCustomer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("\nOrder ID: " + orderId + " | Customer: " + customer.getCustomerName());
        System.out.println("Products Ordered:");
        double totalCost = 0;
        for (Product product : products) {
            System.out.println("- " + product.getProductName() + " | Price: $" + product.getPrice());
            totalCost += product.getPrice();
        }
        System.out.println("Total Cost: $" + totalCost);
    }
}

// Customer class (Association: Customer places multiple Orders)
class EcommerceCustomer {
    private String customerName;
    private List<Order> orders; // Association: A Customer places multiple Orders

    public EcommerceCustomer(String customerName) {
        this.customerName = customerName;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void showOrderHistory() {
        System.out.println("\nOrder History for " + customerName + ":");
        for (Order order : orders) {
            order.showOrderDetails();
        }
    }
}

// Main class to run the system
public class ECommercePlatform {
    public static void main(String[] args) {
        // Creating Customers
        EcommerceCustomer customer1 = new EcommerceCustomer("Customer A");
        EcommerceCustomer customer2 = new EcommerceCustomer("Customer B");

        // Creating Products (Aggregation: Products exist independently)
        Product laptop = new Product("Laptop", 1200.00);
        Product phone = new Product("Smartphone", 800.00);
        Product headphones = new Product("Headphones", 150.00);

        // Creating Orders
        Order order1 = new Order(101, customer1);
        order1.addProduct(laptop);
        order1.addProduct(headphones);

        Order order2 = new Order(102, customer2);
        order2.addProduct(phone);
        order2.addProduct(headphones);

        // Customers placing orders (Association)
        customer1.placeOrder(order1);
        customer2.placeOrder(order2);

        // Display Order History
        customer1.showOrderHistory();
        customer2.showOrderHistory();
    }
}
