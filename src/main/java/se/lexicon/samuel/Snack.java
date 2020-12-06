package se.lexicon.samuel;

public class Snack extends Product{
    private int sugarPercent;

    public Snack(String name, int price, int sugarPercent) {
        super(name, price);
        this.sugarPercent = sugarPercent;
    }

    @Override
    Product purchase(int money) {
        if(money >= getPrice()){
            money = money - getPrice();
            return new Snack(getName(),getPrice(),getSugarPercent());
        } else {
            System.out.println("You do not have sufficient money");
            return null;
        }

    }

    @Override
    public String examine() {
        String priceString = Integer.toString(getPrice());
        String productInfo = "Price of item is " + priceString + " name = " + getName() + " sugar percent = " + getSugarPercent();
        return productInfo;
    }

    @Override
    void use() {
        System.out.println("This product has been used."); //just returns the used statement

    }

    public int getSugarPercent() {
        return sugarPercent;
    }

    public void setSugarPercent(int sugarPercent) {
        this.sugarPercent = sugarPercent;
    }
}
