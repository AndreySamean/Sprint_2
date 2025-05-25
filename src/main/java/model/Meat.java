package model;

import static model.constants.Discount.*;

public class Meat extends Food{

    public Meat(int amount, double price){
        this.amount = amount;
        this.price = price;
        isVegetarian = false;
    }

    @Override
    public double getDiscount() {
        return NO_DISCOUNT;
    }
}
