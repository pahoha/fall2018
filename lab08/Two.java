// Here's step two: get the votes from the file. 

import java.io.*;
import java.util.*; 

public class Two {
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(new File(args[0]));     
    int count = 0; 
    while( in.hasNext() ) {
      String token = in.next(); 
      System.out.println( ++count + ". ***[ " + token + " ]***" ); 
    }
    in.close(); 
  }
}

/* This program reads, counts and reports the words in a given file.
 The name of the file is passed on the command line as the first argument.
 
 Here's the simplest way to run this program:
 
 Welcome to DrJava.  Working directory is C:\Users\dgerman\fall2017\02192018
 > java Two Two.java
 1. ***[ import              ]***
 2. ***[ java.io.*;          ]***
 3. ***[ import              ]***
 4. ***[ java.util.*;        ]***
 5. ***[ public              ]***
 6. ***[ class               ]***
 7. ***[ Two                 ]***
 8. ***[ {                   ]***
 9. ***[ public              ]***
 10. ***[ static              ]***
 11. ***[ void                ]***
 12. ***[ main(String[]       ]***
 13. ***[ args)               ]***
 14. ***[ throws              ]***
 15. ***[ Exception           ]***
 16. ***[ {                   ]***
 17. ***[ Scanner             ]***
 18. ***[ in                  ]***
 19. ***[ =                   ]***
 20. ***[ new                 ]***
 21. ***[ Scanner(new         ]***
 22. ***[ File(args[0]));     ]***
 23. ***[ int                 ]***
 24. ***[ count               ]***
 25. ***[ =                   ]***
 26. ***[ 0;                  ]***
 27. ***[ while(              ]***
 28. ***[ in.hasNext()        ]***
 29. ***[ )                   ]***
 30. ***[ {                   ]***
 31. ***[ String              ]***
 32. ***[ token               ]***
 33. ***[ =                   ]***
 34. ***[ in.next();          ]***
 35. ***[ System.out.println( ]***
 36. ***[ ++count             ]***
 37. ***[ +                   ]***
 38. ***[ ".                  ]***
 39. ***[ ***[                ]***
 40. ***[ "                   ]***
 41. ***[ +                   ]***
 42. ***[ token               ]***
 43. ***[ +                   ]***
 44. ***[ "                   ]***
 45. ***[ ]***"               ]***
 46. ***[ );                  ]***
 47. ***[ }                   ]***
 48. ***[ in.close();         ]***
 49. ***[ }                   ]***
 50. ***[ }                   ]***
 >
 Simplest here is in the sense of as self-sufficient as possible.
 
 So I didn't need to create a new file, I ran it on the source code file. 
*/