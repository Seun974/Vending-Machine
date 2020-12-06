package se.lexicon.samuel;

import java.util.*;

public class VendingMachineImpl implements VendingMachine {
    ArrayList<Integer> denominations = new ArrayList<Integer>();
    ArrayList<Product> products = new ArrayList<>();
    private int moneyPool;

    Drink cocaCola = new Drink("coke", 20, "33cl");
    Food bakedFood = new Food("potatis", 50, 33);
    Snack biscuits = new Snack("kanelbrulle", 100, 10);


    @Override
    public String[] getProducts() {
        return new String[0];
    }


    public VendingMachineImpl() {
        denominations.add(1);
        denominations.add(2);
        denominations.add(5);
        denominations.add(10);
        denominations.add(20);
        denominations.add(100);
        denominations.add(200);
        denominations.add(500);
        denominations.add(1000);

        products.add(cocaCola);
        products.add(bakedFood);
        products.add(biscuits);

        this.moneyPool = 0;
    }

    @Override
    public void addMoney(int money) {
       if(denominations.contains(money)){
            moneyPool += money;
        } else{
            System.out.println("This denomination is not available");
        }
        System.out.println("Your money-pool is " + moneyPool);
    }

    @Override
    public Product buy(int money, int prodNum) {
        return null;
    }

    @Override
    public int returnChange() {
        return 0;
    }

    @Override
    public void presentProduct() {

    }

    @Override
    public int getBalance() {
        return moneyPool;
    }
}
