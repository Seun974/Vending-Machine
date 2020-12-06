package se.lexicon.samuel;

public class Drink extends Product{
    private String volume;

    public Drink(String name, int price, String volume) {
        super(name, price);
        this.volume= volume;
    }

    @Override
    public String examine() {
        String priceString = Integer.toString(getPrice());
        String productInfo = "Price of item is " + priceString + " name = " + getName() + " volume = " + getVolume();
        return productInfo;
    }

    @Override
    Product purchase(int money) {
        if(money >= getPrice()){
            money = money - getPrice();
            return new Drink(getName(),getPrice(),getVolume());
        } else {
            System.out.println("You do not have sufficient money");
            return null;
        }
    }

    @Override
    void use() {
        System.out.println("This product has been used.");

    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
}
