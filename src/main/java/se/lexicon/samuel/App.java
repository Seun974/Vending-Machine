package se.lexicon.samuel;

public class App 
{
    public static void main( String[] args ) {
        VendingMachine vendingMachine;
        //instance of the class
//        Drink drink = new Drink("coke", 20, "33cl");
//
//        System.out.println(drink.examine());
//
//        System.out.println(drink.purchase(1));

//        Food food = new Food ("potatis", 50, 33);
//        System.out.println(food.examine());
//
//        System.out.println(food.purchase(50));
//
//        Snack snack = new Snack("kanelbrulle", 100, 10);
//        System.out.println(snack.examine());
//
//        System.out.println(snack.purchase(100));

        vendingMachine = new VendingMachineImpl();
        vendingMachine.addMoney(1000);

        vendingMachine.addMoney(3000);



//        vendingMachine.buy();
//        vendingMachine.presentProduct();
//        vendingMachine.getBalance();
//        vendingMachine.returnChange();

    }
}
