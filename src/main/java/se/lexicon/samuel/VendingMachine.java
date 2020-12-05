package se.lexicon.samuel;

public interface VendingMachine {

    boolean addMoney(int money);
    Product buy(int money, int prodNum);
    int returnChange();
    void presentProduct();
    int getBalance();

}
