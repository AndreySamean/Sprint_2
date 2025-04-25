package model;

import static model.constants.Colour.*;
import static model.constants.Discount.*;

public class Apple extends Food {

    private final String colour;

    public Apple(int amount, double price, String colour){
        this.amount =amount;
        this.price = price;
        this.colour = colour;
        isVegetarian = true;
    }
    public  String getColour() {
        return colour;
    }

    @Override
    public double getDiscount() {
        if (getColour() == RED) {
            return DISCOUNT_VALUE;
        }
        return NO_DISCOUNT;
    }
}

