package se.lexicon.samuel;

public class Food extends Product {
    private int calories;

    public Food(String name, int price, int calories) {
        super(name, price);
        this.calories = calories;
    }

    @Override
    Product purchase(int money) {
        if(money >= getPrice()){
            money = money - getPrice();
            return new Food(getName(),getPrice(),getCalories());
        } else {
            System.out.println("You do not have sufficient money");
            return null;
        }
    }

    @Override
    public String examine() {
        String priceString = Integer.toString(getPrice());
        String productInfo = "Price of item is " + priceString + " name = " + getName() + " calories = " + getCalories();
        return productInfo;

    }

    @Override
    void use() {
        System.out.println("This product has been used.");
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
