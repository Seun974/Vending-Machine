package se.lexicon.samuel;

import com.sun.org.apache.xpath.internal.operations.String;

public class VendingMachineImpl implements VendingMachine {
    private int[] denominations;
    private Product[] products;
    private int moneyPool;

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public VendingMachineImpl(int[] denominations, Product[] products, int moneyPool) {
        this.denominations = new int[]{1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
        this.moneyPool = moneyPool;
    }

    @Override
    public boolean addMoney(int money) {
        return false;
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
        return 0;
    }
}
