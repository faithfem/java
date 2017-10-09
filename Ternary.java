// Java provides a shortcut that allows you to write if/else statements in a single line of code. It is called the ternary conditional statement.
// The term ternary comes from a Latin word that means "composed of three parts".
//
// These three parts are:
//
// A Boolean expression
// A single statement that gets executed if the Boolean expression is true
// A single statement that gets executed if the Boolean expression is false

int pointsScored = 21;

char gameResult = (pointsScored > 20) ? 'W' : 'L'; //THIS IS THE BOOLEAN EXPRESSION
System.out.println(gameResult);


//PRACTICE
public class Ternary {
  public static void main(String[]args) {

    int fuelLevel = 3;

    char canDrive = (fuelLevel > 0) ? 'Y' : 'N';
    System.out.println(canDrive);
  }
}
