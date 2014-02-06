package edu.grinnell.csc207.strainka.utils;
import java.io.IOException;

import java.io.PrintWriter;
import java.io.BufferedReader;
import java.lang.String;
import java.math.BigInteger;

public class Calculator
{
  
  public static void
  main (String[] args) 
      throws Exception

      {
        PrintWriter pen = new PrintWriter (System.out, true);

        java.io.BufferedReader eyes;
        java.io.InputStreamReader istream;
        istream = new java.io.InputStreamReader (System.in);
        eyes = new java.io.BufferedReader (istream);

        pen.println("What would you like to calculate?");
        String str = eyes.readLine();
        pen.println("you entered: " + str);

        String[] calc = str.split(" "); 
        
        for (int i=0; i<calc.length; i++)
                if (calc[i] == "+") && (calc[i+1] == int)
                  {
                  add (calc[i-1]);
                  } //if the next item is a addition sign and the 
                    //item after is an integer, add them 
        
                else if (calc[i] == "-") && (calc[i+1] == int)
                  {
                  subtract(calc[i-1]]);
                  }//if the next item is a subtraction sign and the 
                   //item after is an integer, subtract them 
        
                else if (calc[i] == "*") && (calc[i+1] == int)
                  {
                  multiply(calc[i-1]); 
                  }//if the next item is a multiplication sign and the 
                   //item after is an integer, multiply them 
        
                else if (calc[i] == "/") && (calc[i+1] == int)
                  {
                  divide(calc[i-1]);
                  }//if the next item is a division sign and the 
                   //item after is an integer, divide them 
      }

  pen.close();

}








