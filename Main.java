import java.util.Scanner;
/**
 * Tell the user all the factors of a given number
 * @author Thomas Quigley
 */
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // ask the user their number, if the number is negative ask again
    int userNumber = 0;
    while (userNumber <= 0) {
      System.out.println("Please enter a positive integer to determine its factors:");
      userNumber = input.nextInt();
    }
    // initialize the numberOn variable 
    int numberOn = 1;

    // tells the user what the factors are and begins the list
    System.out.println("The factors of 5 are:");
    
    // perform a loop that stops when the number it's on = the users number
    while (numberOn <= userNumber) {
      // if the remainder of the userNumber / numberOn = 0 then the numberOn is a factor so then the program prints it out.
      int remainder = userNumber % numberOn;
      if (remainder == 0) {
        System.out.println(numberOn);
      } 
      // goes onto the next number
      numberOn = numberOn + 1;
    }
    
  }
}
