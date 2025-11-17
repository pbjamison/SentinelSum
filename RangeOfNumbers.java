import java.util.Scanner;
   public class RangeOfNumbers {
      public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int startInt;
         int endInt;
         int count;
         System.out.print("Enter starting integer: ");
         startInt = scan.nextInt();
         System.out.print("Enter ending integer: ");
         endInt = scan.nextInt();
         count = startInt; 
         if (startInt < endInt) {
          while (count <= endInt) {
          System.out.print(count + ", ");
          count++;
            }
          }
          else if (startInt > endInt) {
            while (count >= endInt) {
            System.out.print(count + ", ");
            count--;
            }
          }
          else {
          System.out.print(count);
          }
   }
 }