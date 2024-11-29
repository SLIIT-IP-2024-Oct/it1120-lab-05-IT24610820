import java.util.Scanner;

public class IT24610820Lab5Q3{

  
    static final int ROOM_CHARGE_PER_DAY = 48000;
    static final int DISCOUNT_10_PERCENT = 10;
    static final int DISCOUNT_20_PERCENT = 20;
    static final int MIN_DAYS_FOR_DISCOUNT = 3;
    static final int MAX_DAYS_IN_MONTH = 31;

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();
        
        System.out.print("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();

      
        if (startDate < 1 || startDate > MAX_DAYS_IN_MONTH || endDate < 1 || endDate > MAX_DAYS_IN_MONTH) {
            System.out.println("Error: The date(s) entered must be between 1 and 31.");
            scanner.close();
            return;
        }
        
  
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be before the end date.");
            scanner.close();
            return;
        }
        

        int daysReserved = endDate - startDate + 1;
        
       
        System.out.println("Number of days reserved: " + daysReserved);

       
        double totalAmount = ROOM_CHARGE_PER_DAY * daysReserved;
        double discount = 0;
        
        if (daysReserved >= MIN_DAYS_FOR_DISCOUNT && daysReserved <= 4) {
            discount = (totalAmount * DISCOUNT_10_PERCENT) / 100;
        } else if (daysReserved >= 5) {
            discount = (totalAmount * DISCOUNT_20_PERCENT) / 100;
        }

       
        double finalAmount = totalAmount - discount;
        
        
        System.out.println("Total amount to be paid: Rs " + finalAmount);
        
        scanner.close();
    }
}
