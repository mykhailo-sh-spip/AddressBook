import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;

/** 
 * Class that provides static functions for doing terminal input
 *
 *  Created by Sally Goldin, 30 April 2014, for CPE113
 *  Updated to use Scanner, do more error handling - 1 December 2021
 */
public class IOUtils
{

    private static Scanner scan = new Scanner(System.in);

    /**
     * Asks for a string and returns it as the value of the function
     * Continue asking until the user enters a non-empty string.
     * @param   prompt    String to print, asking a question
     * @return  The string the user entered 
     */
    public static String getString(String prompt)
    {
       String inputString = "";
       do
       {
	   System.out.print(prompt);
	   inputString = scan.nextLine();
       } while (inputString.length() == 0); 	   
       return inputString;
    }


    /**
     * Asks for an integer and returns it as the value of the function
     * @param   prompt    String to print, asking a question
     * @return value entered. If not an integer, prints an error message
     * and returns -999  
     */
    public static int getInteger(String prompt)
    {
      int value = 0;
       boolean bGoodValue = false;	   
       String inputString;
       do
       {
	   System.out.print(prompt);
	   inputString = scan.nextLine();
	   try 
           {
	       value = Integer.parseInt(inputString);
	       bGoodValue = true;
	   }
	   catch (NumberFormatException nfe) 
	   {
	       System.out.println("Please enter a valid integer");
	   }
       } while (!bGoodValue);
       return value;
    }

    /** 
     *  Creates and returns a string with the current date
     *  and time, to use as a time stamp.
     * @return date/time string in the form "yyyy-mm-dd hh:mm:ss"
     */
    public static String getDateTime()
    {
	Date now = new Date();
	SimpleDateFormat formatter = 
              new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	return formatter.format(now);
    }
    /** Main - just to test the functions in this module 
     */
    public static void main(String args[])
    {
	String testString = getString("Enter any string: ");
	System.out.println("You entered |" + testString + "|");
	int someValue = getInteger("Enter any integer: ");
	System.out.println("You entered |" + someValue + "|");
        String date = getDateTime();
	System.out.println("Date/time string is |" + date + "|");
	
    }
}
