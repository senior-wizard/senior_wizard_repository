package model;

import static model.constants.Colour.redColour;

public class Apple extends Food {
    String colour;
    public Apple(int amount, double price, String colour){
        super(amount, price);
        this.colour = colour;
        this.isVegetarian = true;
    }
    public String getColour() {
        return colour;
    }
    @Override
    public double getDiscount() {
        if (colour == redColour) {
            return 0.60;
        }
        else return 0;
    }

}

