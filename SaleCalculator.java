import java.util.Scanner;
/*
    @author Ronald Ewing
    @course CSCI 1010-9 and 1011-1
    @assignment 4

        This assignment is taking an input of an items cost and
        calculating three main parts Tax (9%), Delivery Fee (1%), and Total.
 */
public class SaleCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is cost uwu?");
        String costString = scanner.nextLine();

        int cost = Integer.parseInt(costString);

        double tax      = cost*0.09;
        double delivery = cost*0.01;
        double total    = (cost)+(cost*0.09)+(cost*0.01);

        System.out.println("Cost: $"     + cost);
        System.out.println("Tax: $"      + tax);
        System.out.println("Delivery: $" + delivery);
        System.out.println("Total: $"    + total);

    }
}