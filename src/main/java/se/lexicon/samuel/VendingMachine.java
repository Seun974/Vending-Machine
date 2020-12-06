package se.lexicon.samuel;

public interface VendingMachine {

    void addMoney(int money);
    Product buy(int money, int prodNum);
    int returnChange();
    void presentProduct();
    int getBalance();
    String[] getProducts();


}
