package service;

import model.Apple;
import model.Food;
import model.constants.Discount;

import static model.constants.Colour.redColour;

public class ShoppingCart {
    double total;
    static Food[] foodElements;
    public ShoppingCart(Food[] foodElements) {
        this.foodElements = foodElements;
    }
    public static double getTotal() {
        double total = 0;
        for(int i = 0; i < foodElements.length; i++) {
            total = total + (foodElements[i].getPrice() * foodElements[i].getAmount());
        }
        return total;
    }
    public static double getTotalWithDiscount() {
        double total = 0;
        for(int i = 0; i < foodElements.length; i++) {
            total = total + ((foodElements[i].getPrice() - foodElements[i].getPrice() * Discount.getDiscount()) * foodElements[i].getAmount());
        }
        return total;

    }
    public static double getTotalOnlyIsVegetarian() {
        double total = 0;
        for(int i = 0; i < foodElements.length; i++) {
            if (foodElements[i].isVegetarian()) {
                total = total + (foodElements[i].getPrice() * foodElements[i].getAmount());
            }
        }
        return total;
    }
}
