public class Not {
	public static void main(String[] args) {

		System.out.println(5!=9);
		System.out.println(!(7<9));

	}
}

//LINE 4 EVALUATES TO TRUE
//LINE 5 EVALUATES TO FALSE


//4th line below has a code statement that is incomplete. Use each Boolean operator no more than once to replace the empty comments /**/. The code statement should print out false.
public class Precedence {
	public static void main(String[] args) {

		boolean riddle = !( 1 < 8 && (5 > 2 || 3 < 5));
		System.out.println(riddle);

	}
}
