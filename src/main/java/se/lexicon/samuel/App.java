package se.lexicon.samuel;

public class App 
{
    public static void main( String[] args ) {
        VendingMachine vendingMachine;
        vendingMachine = new VendingMachineImpl();
        vendingMachine.addMoney();
        vendingMachine.buy();
        vendingMachine.presentProduct();
        vendingMachine.getBalance();
        vendingMachine.returnChange();

    }
}
