import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;
import static model.constants.Colour.*;


public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);

        Food redApple = new Apple(10, 50, RED);

        Food greenApple = new Apple(8, 60, GREEN);

        ShoppingCart shoppingCart = new ShoppingCart(new Food[]{meat, redApple, greenApple});

        shoppingCart.getUndiscountedPrice();
        shoppingCart.getDiscountedPrice();
        shoppingCart.getVegDiscountedPrice();

    }
}
