package com.mjs8071;

import java.math.BigDecimal;
import java.util.*;

public class UserInterface {
    Scanner keyboard = new Scanner(System.in);

    public String mainMenu() {
        while (true) {
            System.out.println("(1) Display vending machine items");
            System.out.println("(2) Purchase");
            System.out.println("(3) Exit");
            System.out.print(">>> ");
            String menuSelection = keyboard.nextLine();
            if (menuSelection.equals("1") || menuSelection.equals("2") || menuSelection.equals("3") || menuSelection.equals("4")) {
                return menuSelection;
            }
            System.out.println("Incorrect selection please select either 1, 2, or 3");
        }
    }

    public void displayMachineItems(Stock stock) {
        Set<String> keySet = stock.getStockMap().keySet();
        List<String> keys = new ArrayList<>(keySet);
        Collections.sort(keys);
        for (String key : keys) {
            System.out.println(key + " " + stock.getStockMap().get(key).toString());
        }
    }

    public String purchaseMenu(BigDecimal balance) {
        while (true) {
            System.out.println("(1) Feed Money");
            System.out.println("(2) Select Product");
            System.out.println("(3) Finish Transaction");
            System.out.println("\nCurrent money provided: $" + balance.toString());
            System.out.print(">>> ");
            String menuSelection = keyboard.nextLine();
            if (menuSelection.equals("1") || menuSelection.equals("2") || menuSelection.equals("3")) {
                return menuSelection;
            }
            System.out.println("Incorrect selection please select either 1, 2, or 3");
        }
    }

    public void finishTransactionDisplay(int quarters, int dimes, int nickels) {
        System.out.println("New balance: $0, your change is: ");
        System.out.println("Quarters:" + quarters);
        System.out.println("Dimes:" + dimes);
        System.out.println("Nickels:" + nickels);
    }

    public boolean selectProductDisplay(Stock stock, String itemCode){
        //displayMachineItems(stock);
        //System.out.println("Enter item code");
        if (!stock.getStockMap().containsKey(itemCode)){
            System.out.println("Item code does not exist!");
            return false;
        }
        if (stock.getStockMap().get(itemCode).getCurrentCount() <= 0){
            System.out.println("SOLD OUT");
            return false;
        }
        return true;
    }



}
