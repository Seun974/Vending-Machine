package se.lexicon.samuel;

import java.util.ArrayList;

public interface VendingMachine {

    void addMoney(int money);
    Product buy(int prodNum);
    int returnChange();
    void presentProducts(ArrayList<Product> products);
    int getBalance();
    String[] getProducts();


}
