package com.bridgelabz.classandobject.leveltwo;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Scanner;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;
    private String cartName;

    private static ArrayList<CartItem> cartItem;

    // Constructor to initialize item details
    public CartItem(String itemName, double price, int quantity,String cartName) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.cartName = cartName;
        CartItem.cartItem = new ArrayList<>();
    }

    // Method to calculate total cost
    public double getTotalCost() {
        return price * quantity;
    }

    // Method to display item details
    public void displayItem() {
        System.out.println("\nItem Details:");
        System.out.println("Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + getTotalCost());
    }

    public static void addItem (CartItem item){
        cartItem.add(item);
    }

    public static void removeItem(CartItem item){
        cartItem.remove(item);
    }

    public static void displayCarts(){

        for(CartItem cart: cartItem){

            System.out.println(cart.itemName);
            System.out.println("-----------------");
        }
    }


}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for item details
        System.out.print("Enter Item Name: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter Item Price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        // Creating a cart item object and displaying details
        CartItem cart = new CartItem("banana", 23, 5 ,"big save");

        cart.displayItem();
//        CartItem cart2 = new CartItem("apple", 4334, 6,"amazon");
//        CartItem cart3 = new CartItem("pear", 323, 5,"flipkart");

//        CartItem.addItem(cart2);
//        CartItem.addItem(cart);
//        CartItem.addItem(cart3);
//
//        CartItem.displayCarts();
//
//



        // Closing the scanner to prevent resource leaks
        scanner.close();
    }
}
