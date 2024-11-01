import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.greenColour;
import static model.constants.Colour.redColour;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food redApple = new Apple(10,50,redColour);
        Food greenApple = new Apple(8,60,greenColour);
        Food[] foodElements = {meat,redApple,greenApple};
        ShoppingCart shoppingCart = new ShoppingCart(foodElements);
        System.out.println(ShoppingCart.getTotal());
        System.out.println(ShoppingCart.getTotalWithDiscount());
        System.out.println(ShoppingCart.getTotalOnlyIsVegetarian());
    }
}
