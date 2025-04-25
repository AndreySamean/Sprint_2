package service;

import model.Food;

public class ShoppingCart {
    private Food[] food;

    public ShoppingCart(Food[] food) {

        this.food = food;
    }

    public void getUndiscountedPrice() {
        double sumPrice = 0;
        for (int i = 0; i < food.length; i++){
            sumPrice += food[i].getPrice() * food[i].getAmount();
        }
        System.out.println("Стоимость товаров без скидки " + sumPrice);
    }

    public void getDiscountedPrice() {
        double sumPrice = 0;
        for (int i = 0; i < food.length; i++){
            sumPrice = sumPrice + ((food[i].getPrice() - food[i].getPrice() * (food[i].getDiscount() / 100))) * food[i].getAmount();
        }
        System.out.println("Стоимость товаров со скидкой " + sumPrice);
    }

    public void getVegDiscountedPrice() {
        double sumPrice = 0;
        for (int i = 0; i < food.length; i++){
            if (food[i].isVegetarian()) {
                sumPrice += food[i].getPrice() * food[i].getAmount();
            }
        }
        System.out.println("Стоимость всех вегетарианских продуктов без скидки " + sumPrice);
    }

}
