import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Name : ");
        String name = input.nextLine();

        System.out.print("Age :");
        int age = input.nextInt();
        input.nextLine();//Remove new line character...!

        System.out.print("GPA :");
        double gpa = input.nextDouble();

        System.out.print("Are you a student?(true/false)");
        boolean isStudent = input.nextBoolean();

        System.out.println("Hello " +name );
        System.out.println("You are "+age+" years old");
        System.out.println("Your GPA is "+gpa);

        if(isStudent){
            System.out.println("you are a student");
        }
        else {
            System.out.println("You are NOT a student");
        }

        input.close();
    }
}
