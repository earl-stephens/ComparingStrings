package application;

public class App {

	public static void main(String[] args) {
		String text1 = "orange";
		String text2 = "oranges";
		
		System.out.println(text1 == text2);
		
		/*String is a class, not a primitive
		String variables are just locations in memory of the text.
		IOW, they are two separate locations that happen to have the
		same text in them.
		*/
		
		/* The above works because of Java optimization.
		 * When the two are initialized with the same values,
		 * Java assigns the two variables to the same location.
		 * If one of them changes, then there will be two separate
		 * locations in memory.
		 */

		// The below is the correct way to compare strings
		// This is more reliable than using ==
		
		System.out.println(text1.equals(text2));
		
		/* text1.equals - equals is a method in the text1 class
		 * which is a class of String, and text2 is the argument
		 * passed to this method
		 */
	}

}
