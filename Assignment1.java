import java.util.Scanner;
import java.util.Random;
public class Assignment1 {
  public static void main(String[] args) {
    // Assignment 1: printing, equations, manipulating strings, integers, concating strings
    // File: Assignment1.java
    
    Scanner stringScan = new Scanner(System.in); //user input
    int degF; //input fahrenheit
    double degC; //output celsius
    String longChar; //input 5 character string
    String shortChar; // output reverse 3 character string
    Random random;

    System.out.println ("NNNN          NNN\t  GGGGGG");
    System.out.println ("NNNNNN        NNN\tGGG     GG");
    System.out.println ("NNN NNN       NNN\tGGG");
    System.out.println ("NNN  NNN      NNN\tGGG GGGGGGG");
    System.out.println ("NNN   NNN     NNN\tGGG   GGG");
    System.out.println ("NNN    NNN    NNN\tGGG   GGG");
    System.out.println ("NNN     NNNN  NNN\tGGGG  GGG");
    System.out.println ("NNN       NNNNNNN\t GGGGGGG");
    System.out.println ("\n"); 
    
      System.out.print ("Please enter a number in degrees Fahrenheit: ");
      System.out.print ("\n");
      degF = stringScan.nextInt();
      degC = (degF - 32.0) * 5.0/9.0;
      System.out.println (degC);

      System.out.print ("Please enter a 5-character string: "); 
      System.out.print ("\n");
      longChar = stringScan.next();
      shortChar = new StringBuilder(longChar.substring(beginIndex:1 endIndex:4));
      System.out.println (shortChar);

  rand = new Random();
  
  }
}
