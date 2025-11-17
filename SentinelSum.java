import java.util.Scanner;      
   
public class SentinelSum {
   public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   int sumAll = 0;
   System.out.print("Please enter a number to average in or -1 to stop: ");
   int recentResponse = scanner.nextInt();
      while (recentResponse != -1) {
      sumAll += recentResponse;
      System.out.println("You entered " + recentResponse);
      System.out.println("Please enter another number or -1 to stop: ");
      recentResponse = scanner.nextInt();
      }
   System.out.println("Sum is " + sumAll);
    }
   }