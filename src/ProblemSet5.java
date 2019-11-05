/**
 * Problem Set 5.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * built-in methods, most notable of the String class. It is also your first
 * introduction to methods that accept parameters and return values. The main
 * method is declared, but it is up to you to implement. Write your code for each
 * exercise in the corresponding method. Make sure you test your code thoroughly.
 * 
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Your code must meet the
 * requirements set forth in this section, and must support all possible values
 * that might be passed into your methods.
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */
 
public class ProblemSet5 {
    
    public static void main(String[] args) {
        ProblemSet5 ps = new ProblemSet5();
	      System.out.println(ps.surroundMe("termin", "inus"));
	      System.out.println(ps.endsMeet("absolute", 3));
	      System.out.println(ps.middleMan("lastima"));
	      System.out.println(ps.isCentered("lacrimosa", "rim"));
	      System.out.println(ps.countMe("Ecce! In pictura est puella, nomine Cornelia. Cornelia est puella Romana quae in Italia habitata", 'a'));
	      System.out.println(ps.triplets("dophelsdowaaarowistermiiinulllaAae"));
    }
    
    /*
     * Exercise 1.
     * 
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */
    
    public String surroundMe(String in, String out) {
    if ((in != null && !in.equals("")) && (out != null && !out.equals("")) && (out.length() == 4)) {
      return (out.substring(0, 2) + in + out.substring (2, 4));
    } else {
      return in;
    }
  }
    
    /*
     * Exercise 2.
     * 
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text.
     */
    
    public String endsMeet(String text, int n) {
      if ((text != null && !text.equals("")) && (text.length() >= 1 && text.length() <= 10) && (((Integer.toString(n)).length() >= 1 && ((Integer.toString(n)).length() <= text.length())))) {
      return text.substring(0, n) + text.substring((text.length() - n));
    } else {
      return text;
    }
    }
    
    /*
     * Exercise 3.
     * 
     * Given a string, return a new string using the middle three characters of text.
     */
    
    public String middleMan(String text) {
    int lengthOfString = text.length();
    int subtractedLength = lengthOfString - 3;
    int fromEachSide = subtractedLength / 2;
    if ((text != null && !text.equals("")) && (text.length() >= 3 && (text.length() % 2 == 1))) {
      return text.substring(fromEachSide, text.length() - fromEachSide);
    } else {
      return text;
    }
  }
    
    /*
     * Exercise 4.
     * 
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */
    
    public boolean isCentered(String text, String target) {
    int lengthOfString = text.length();
    int subtractedLength = lengthOfString - 3;
    int fromEachSide = subtractedLength / 2;
    if ((text != null && !text.equals("")) && (text.length() >= 3 && (text.length() % 2 == 1)) && (target != null && !target.equals("")) && (target.length() == 3)) {
      String midThree = text.substring(fromEachSide, text.length() - fromEachSide);
      return (midThree.equals(target));
    } else {
      return false;
    }
  }
    
    /*
     * Exercise 5.
     * 
     * Given a string and a character, compute the number of words that end in suffix.
     */
    
      public int countMe(String text, char suffix) {
    int wordMatchCounter = 0;
    String suffixString = Character.toString(suffix);
    if ((text != null && !text.equals("")) && Character.isLetter(suffix)) {
      for (int counter = 1; counter <= text.length(); counter++) {
        char countChar = text.charAt(counter - 1);
        boolean charMatches = (Character.isLetter(countChar));
        if (charMatches == false) {
          String word = text.substring(0, counter - 1);
          text = text.substring(counter);
          counter = 0;
          if (word.endsWith(suffixString)) {
            wordMatchCounter += 1;
          }
        }
        if (counter == text.length()) {
          if (text.endsWith(suffixString)) {
            wordMatchCounter += 1;
          }
        }
      }
      return wordMatchCounter;
    } else {
      return -1;
    }
  }
    
    /*
     * Exercise 6.
     * 
     * Given a string, compute the number of triplets in text.
     */
    
public int triplets(String text) {
    int tripletCounter = 0;
    if ((text != null && !text.equals(""))) {
      for (int countUp = 2; countUp <= text.length(); countUp++) {
        if (((text.charAt(countUp - 1) == (text.charAt(countUp - 2))) && (text.charAt(countUp - 1) == (text.charAt(countUp - 3))))) {
          tripletCounter += 1;
        }
      }
      return tripletCounter;
    } else {
      return -1;
    }
  }
    
    /*
     * Exercise 7.
     * 
     * Given a string, compute the sum of the digits in text.
     */
    
    public long addMe(String text) {
return 1;
    }
    
    /*
     * Exercise 8.
     * 
     * Given a string, compute the length of the longest sequence.
     */
    
    public long sequence(String text) {
return 1;
    }
    
    /*
     * Exercise 9.
     * 
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */
    
    public String intertwine(String a, String b) {
return "1";
    }
    
    /*
     * Exercise 10.
     * 
     * Given a string, determine whether or not it is a palindrome.
     */
    
    public boolean isPalindrome(String text) {
return true;
    }
}
