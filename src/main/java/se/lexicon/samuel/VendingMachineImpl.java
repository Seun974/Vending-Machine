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

        presentProducts(products);

        this.moneyPool = 0;
    }
    public void presentProducts(ArrayList<Product> products){
       for(int i=0; i<products.size(); i++)
        System.out.println("Product number is " + i + " - " + products.get(i).getName());

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
    public Product buy(int prodNum) {
        int productPrice = products.get(prodNum).getPrice();
        if (moneyPool >= productPrice){
            moneyPool -= productPrice;
            System.out.println("Your money pool is " + moneyPool);
            return products.get(prodNum);
        }else{
            System.out.println("You have insufficient funds");
            return null;
        }

    }

    @Override
    public int returnChange() {
        int change = moneyPool;
        moneyPool = 0;
        System.out.println("Your change to be returned is " + change);
        return change;
    }

    @Override
    public int getBalance() {
        return moneyPool;
    }

}
