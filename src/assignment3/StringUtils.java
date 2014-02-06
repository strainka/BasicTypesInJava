package assignment3;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.lang.String;

public class StringUtils
{

  /*
   * 
   * Part A: Segmenting Strings
   * 
   */ 

  public static String
  splitAt (String str, char symbol)
      throws Exception
      {    
        int[] splitnew; 
        for (int i=0; i < str.length (); i++)
          {
            splitnew[i] = str[i];
            for (int j=0; j < str.length (); j++)
              {
                splitnew[j] = symbol; 
              } // for, adds symbol to array
          } //for, adds string to array

  /*
   * 
   * Part C: Leet
   * 
   */ 
  public static void
  main (String[] args) 
      throws Exception
      {
        PrintWriter pen = new PrintWriter (System.out, true);

        java.io.BufferedReader eyes;
        java.io.InputStreamReader istream;
        istream = new java.io.InputStreamReader (System.in);
        eyes = new java.io.BufferedReader (istream);

        pen.println("What is the word in leet?");
        String leet = eyes.readLine();

        String leet1 = leet.replace("@", "a");
        String leet2 = leet1.replace("|3", "b"); 
        String leet3 = leet2.replace("3", "e"); 
        String leet4 = leet3.replace("1", "l"); 
        String leet5 = leet4.replace("|\\|", "n") ;
        String leet6 = leet5.replace("0", "o"); 
        String leet7 = leet6.replace("+", "t");

        pen.println("in english: " + leet7); 
        pen.close ();
      } //main, returns string of leet converted into english 

  /*
   * 
   * PartD: The Name Game
   * 
   */
  public static void
  main (String[] args)
      throws Exception
      {
        PrintWriter pen1 = new PrintWriter (System.out, true);

        java.io.BufferedReader eyes;
        java.io.InputStreamReader istream;
        istream = new java.io.InputStreamReader (System.in);
        eyes = new java.io.BufferedReader (istream);

        pen1.println("what is your name");
        String name1 = eyes.readLine();
        //String ame = name1.substring(1); 

        String ame = name1;
        if ((ame.charAt(1) == 'a') ||
            (ame.charAt(1) == 'e') ||
            (ame.charAt(1) == 'i') ||
            (ame.charAt(1) == 'o') ||
            (ame.charAt(1) == 'u'))
          {
            ame = name1.substring(2);
          } // if the second character is a vowel, make a new string 
            // beginning at the third character
        else 
          {
            ame = name1.substring(1);
          } // if the second character is not a vowel, make a new
            // string beginning at the second character

        pen1.println ("The Name Game");
        pen1.println (name1 + "!");
        pen1.println (name1 + ", " + name1 + " bo b" + ame + " Bonana fanna fo F" + ame);
        pen1.println (" Fee fy mo m" + ame + ", " + name1 + "!");
        pen1.close ();

      } //main 

}





