// This is the third step: sort the candidates by the number of votes they received:

import java.util.ArrayList; 
import java.util.Collections; 

public class Student implements Comparable<Student> {
  public int compareTo(Student other) {
    if (this.age < other.age) return -1; // I am younger I go first 
    else if (this.age > other.age) return 1; 
    else return this.name.compareTo(other.name); 
    // https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
  }
  private String name;
  private int age; 
  private double gpa; 
  public Student(String name, int age, double gpa) {
    this.name = name;
    this.age = age;
    this.gpa = gpa; 
  }
  public String toString() {
    return name + "/" + age;  
  }
  public static void main(String[] args) {
    ArrayList<Student> a = new ArrayList<Student>(); 
    a.add(new Student("Lukas"  , 10, 3.2)); 
    a.add(new Student("Laura"  , 10, 3.2)); 
    a.add(new Student("Larry"  , 10, 3.2)); 
    a.add(new Student("Lynn"   ,  9, 3.2)); 
    a.add(new Student("Leslie" , 10, 3.2));     
    System.out.println( a ); 
    Collections.sort( a ); 
    System.out.println( a ); 
  }
}

// Here's the output: 
// 
// Welcome to DrJava.  Working directory is C:\Users\dgerman\Desktop\07-05-2018
// > run Student
// [Lukas/10, Laura/10, Larry/10, Lynn/9, Leslie/10]
// [Lynn/9, Larry/10, Laura/10, Leslie/10, Lukas/10]
// > 