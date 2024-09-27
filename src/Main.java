import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double itemCost = 0.00;
        double shippingCost = 1.02;

        System.out.println("Enter the price of the item: ");
        itemCost = in.nextDouble();
        in.nextLine();
         if (itemCost >= 100){
             System.out.println("Shipping is free. Item cost is " + itemCost);
         } else if (itemCost <=100 && itemCost >=1){
             itemCost = itemCost * shippingCost;
             System.out.println("The total item cost is " + itemCost);
         } else {
             System.out.println("You have entered the wrong value");
         }
    }
}