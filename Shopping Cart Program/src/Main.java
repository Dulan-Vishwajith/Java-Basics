import java.util.Scanner;

public class Main {
    public static void main(String[] ars){
        Scanner input=new Scanner(System.in);

        String  item;
        double price;
        int quantity;
        String currency ="LKR";
        double total;

        System.out.print("What item would you like to buy? : ");
        item=input.nextLine();

        System.out.print("What is the price for each? : ");
        price=input.nextDouble();

        System.out.print("How many would you like? : ");
        quantity= input.nextInt();
        input.nextLine();

        total=price * quantity;

        System.out.println("\nYou have bought "+quantity+" "+item+"/s");
        System.out.println("Your total is "+currency+" "+total);




        input.close();
    }
}
