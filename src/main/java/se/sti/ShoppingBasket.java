package se.sti;

import java.util.ArrayList;

public class ShoppingBasket {

    public static ArrayList<Clothes> shoppingBasket = new ArrayList<>();

    public static void main( String[] args ) {

    }

    public static void addingItem(Clothes item){
        shoppingBasket.add(item);
    }

    public static void removeItem(){
        shoppingBasket.remove(shoppingBasket.size()-1);
    }

    public static void removeAllItems(){
        shoppingBasket.clear();
    }

    public static int numberOfItems(){
        return shoppingBasket.size();
    }

    public static double totalCostOfItems(ArrayList<Clothes> shoppingBasket){
        int sum = 0;

        for(Clothes c : shoppingBasket){
            sum += c.getPrice();
        }

        return sum;
    }

}
