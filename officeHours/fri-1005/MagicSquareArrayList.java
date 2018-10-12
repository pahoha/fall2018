import java.util.ArrayList; 

public class MagicSquareArrayList { // this is done with Ahmed from various prior pieces
  public static void main(String [] args) {
    int m[][] = // all the tests that we have tried
    { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } };
    // { { 4, 9, 2 }, { 3, 7, 5 }, { 8, 1, 6 } };
    // { { 4, 9, 2 }, { 3, 5, 7 }, { 9, 1, 6 } };  
    // { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} }; 
    // { {1,18, 3}, {4, 5, 6}, {7, 8, 9} }; 
    // { {1,-1, 3}, {4, 5, 6}, {7, 8, 9} }; 
    // { {1, 3, 3}, {4, 5, 6}, {7, 8, 9} }; 
    // { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} }; 
    // { {16, 3, 2, 13}, {5, 10, 11, 8}, { 9, 6, 7, 12}, {4, 15, 14, 1} }; 
    ArrayList<ArrayList<Integer>> n = new ArrayList<ArrayList<Integer>>(); // all of main is what we worked with Bote
    boolean test; 
    for(int i = 0; i < m.length; i++) {
      ArrayList<Integer> row = new ArrayList<Integer>();
      for(int j = 0; j < m[i].length; j++) {
        row.add(m[i][j]);         
      }   
      n.add(row); 
    }
    test = MagicSquareArrayList.isMagicSquare( n ); 
    System.out.println("Is your matrix "+ MagicSquareArrayList.toString(n) + "a magic square? Answer: " + test);
  }
  public static boolean isMagicSquare(ArrayList<ArrayList<Integer>> whatever) { // this is due to Kylan
                // still needs to check for diagonals but otherwise complete and quite compact and creative
    int n = whatever.size();
    int squared = n*n;
    int f = (squared *(squared + 1) / 2) / n;
    int totalRows = 0, totalColumns = 0;
    boolean[] multiple = new boolean [squared];
    for(int row=0; row<n; row++){
      totalRows = 0;
      totalColumns = 0;
      for(int col=0; col<n; col++){
        if(whatever.get(row).get(col) < 1 || whatever.get(row).get(col)>squared) return false;
        // except the input is of a different type 
        if(multiple[whatever.get(row).get(col)-1]==true) return false;
        multiple[whatever.get(row).get(col)-1]=true;
        totalRows = totalRows + whatever.get(row).get(col);
        totalColumns = totalColumns + whatever.get(col).get(row);
      }
      if (totalRows != f) return false; 
      if (totalColumns != f) return false; 
    }
    return true; 
  }
  public static String toString(ArrayList<ArrayList<Integer>> whatever) { // this is what we worked with Kylan 
    String result = "\n";
    for (int row = 0; row < whatever.size(); row++) {
      for (int col = 0; col < whatever.get(row).size(); col++) {
        result = result + String.format( " %2d", whatever.get(row).get(col) );
        // also: https://www.cs.indiana.edu/classes/c212-dgerman/fall2015/backmatter.jpg
      }
      result = result + "\n"; 
    }
    return result; // + "\n";
  }
}