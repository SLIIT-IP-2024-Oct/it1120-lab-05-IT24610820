import java.util.Scanner;

public class IT24610820Lab5Q2{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of new members you have introduced: ");
        int newMembers = scanner.nextInt();
        
       
        if (newMembers < 0) {
            System.out.println("Please enter a valid number of new members (greater than or equal to 0).");
        } else {
           
            switch (newMembers) {
                case 0:
                    System.out.println("No Prize");
                    break;
                case 1:
                    System.out.println("Pen");
                    break;
                case 2:
                    System.out.println("Umbrella");
                    break;
                case 3:
                    System.out.println("Bag");
                    break;
                case 4:
                    System.out.println("Travelling Chair");
                    break;
                default:
                    System.out.println("Headphone");
                    break;
            }
        }
        
        
        scanner.close();
    }
}