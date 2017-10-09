//SWITCH STATEMENTS PROVIDE a way to execute code blocks based on whether a block is equal to a specific value
// The break statement will exit the switch statement after a condition is met.
// Without the break statement, Java will continue to check whether the value of restaurantRating matches any other cases.

int restaurantRating = 3;

switch (restaurantRating) {

  case 1: System.out.println("This restaurant is not my favorite.");
  break;

  case 2: System.out.println("This restaurant is good.");
  break;

  case 3: System.out.println("This restaurant is fantastic!");
  break;

  default: System.out.println("I've never dined at this restaurant.");
  break
}


//PRACTICE
public class Switch {
	public static void main(String[] args) {

		char penaltyKick = 'L';

		switch (penaltyKick) {

			case 'L': System.out.println("Messi shoots to the left and scores!");
								break;
			case 'R': System.out.println("Messi shoots to the right and misses the goal!");
								break;
			case 'C': System.out.println("Messi shoots down the center, but the keeper blocks it!");
								break;
			default:
				System.out.println("Messi is in position...");

		}

	}
}
