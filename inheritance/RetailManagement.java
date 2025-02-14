package com.bridgelabz.inheritance;

import java.util.Date;

// Base class Order
class Order {
    private String orderId;
    private Date orderDate;

    public Order(String orderId, Date orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public void getOrderStatus() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: Order Placed");
    }
}

// Subclass ShippedOrder
class ShippedOrder extends Order {
    private String trackingNumber;

    public ShippedOrder(String orderId, Date orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Status: Order Shipped");
    }
}

// Subclass DeliveredOrder
class DeliveredOrder extends ShippedOrder {
    private Date deliveryDate;

    public DeliveredOrder(String orderId, Date orderDate, String trackingNumber, Date deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println("Status: Order Delivered");
    }
}


public class RetailManagement {
    public static void main(String[] args) {
        // Creating order
        Order order1 = new Order("ORD123", new Date());
        ShippedOrder order2 = new ShippedOrder("ORD456", new Date(), "TRACK123");
        DeliveredOrder order3 = new DeliveredOrder("ORD789", new Date(), "TRACK789", new Date());


        System.out.println("\nOrder Status ");
        order1.getOrderStatus();

        System.out.println("\nShipped Order Status ");
        order2.getOrderStatus();

        System.out.println("\nDelivered Order Status");
        order3.getOrderStatus();
    }
}
