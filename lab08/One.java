// Here's the first of three steps you need to solve Lab 08:

import java.util.*;

public class One {
  public static void main(String[] args) {
    String word = args[0]; 
    HashMap<String, Integer> a = new HashMap<String, Integer>(); 
    // https://docs.oracle.com/javase/8/docs/api/java/util/Map.html
    // https://www.cs.indiana.edu/classes/c212-dgerman/fall2015/backmatter.jpg
    for (int i = 0; i < word.length(); i++) {
      String letter = word.substring(i, i+1); 
      if (a.containsKey(letter)) {
        a.put(letter, 1 + a.get(letter));
      } else {
        a.put(letter, 1); 
      }
      System.out.println( a ); // see the updated hash
    }
  }
}

// also: https://www.cs.indiana.edu/classes/c212-dgerman/fall2015/frontmatter.jpg

/* This is how this runs:
 * 
   Welcome to DrJava. 
   > java One banana
   {b=1}
   {a=1, b=1}
   {a=1, b=1, n=1}
   {a=2, b=1, n=1}
   {a=2, b=1, n=2}
   {a=3, b=1, n=2}
   > 
   
   It profiles words. If each letter is a candidate, then a word is an election.
 */