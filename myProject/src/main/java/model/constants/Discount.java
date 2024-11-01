package model.constants;


import model.Apple;
import model.Discountable;

import static model.constants.Colour.redColour;

public class Discount implements Discountable {
    @Override
    public double getDiscount() {
        if (Apple.getColour() == redColour)
    }
}


