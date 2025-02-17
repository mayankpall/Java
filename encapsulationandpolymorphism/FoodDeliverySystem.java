package com.bridgelabz.encapsulationandpolymorphism;

import java.util.ArrayList;
import java.util.List;

// Abstract Class: FoodItem
abstract class FoodItem {
    private String itemName;
    private int price;
    private int quantity;

    FoodItem(String itemName, int price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    abstract int calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("\n Item Details:");
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

// Interface: Discountable
interface Discountable {
    void applyDiscount();
    void getDiscountDetails();
}

// Subclass: VegItem
class VegItem extends FoodItem {
    private static final int ADDITION_CHARGE = 18;

    VegItem(String itemName, int price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public int calculateTotalPrice() {
        return (getPrice() * getQuantity()) + ADDITION_CHARGE;
    }

    @Override
    public void getItemDetails() {
        super.getItemDetails();
        System.out.println("Additional Charges: " + ADDITION_CHARGE);
        System.out.println("Total Price: " + calculateTotalPrice());
    }
}

// Subclass: NonVegItem
class NonVegItem extends FoodItem implements Discountable {
    private static final int ADDITION_CHARGE = 28;
    private static final int DISCOUNT_VALUE = 20;
    private int currentPrice;

    NonVegItem(String itemName, int price, int quantity) {
        super(itemName, price, quantity);
        this.currentPrice = calculateTotalPrice();
    }

    @Override
    int calculateTotalPrice() {
        currentPrice = (getPrice() * getQuantity()) + ADDITION_CHARGE;
        return currentPrice;
    }

    @Override
    public void applyDiscount() {
        System.out.println(" Applying discount...");
        calculateTotalPrice();
        currentPrice -= DISCOUNT_VALUE;
        System.out.println("Discount of " + DISCOUNT_VALUE + " applied successfully!");
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Discount Value: " + DISCOUNT_VALUE);
        System.out.println("Total Price After Discount: " + currentPrice);
    }

    @Override
    public void getItemDetails() {
        super.getItemDetails();
        System.out.println("Additional Charges: " + ADDITION_CHARGE);
        System.out.println("Total Price Before Discount: " + calculateTotalPrice());
    }
}


public class FoodDeliverySystem {
    public static void main(String[] args) {

        FoodItem itemOne = new NonVegItem("Chicken ", 230, 1);
        FoodItem itemTwo = new NonVegItem("Mutton ", 340, 2);
        FoodItem itemThree = new VegItem("Paneer ", 120, 2);
        FoodItem itemFour = new VegItem("Dal ", 90, 3);


        List<FoodItem> items = new ArrayList<>();
        items.add(itemOne);
        items.add(itemTwo);
        items.add(itemThree);
        items.add(itemFour);


        for (FoodItem item : items) {
            item.getItemDetails();
            if (item instanceof Discountable) {
                ((Discountable) item).applyDiscount();
                ((Discountable) item).getDiscountDetails();
            }
        }
    }
}
