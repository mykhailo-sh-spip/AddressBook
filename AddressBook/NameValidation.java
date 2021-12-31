package AddressBook;

import java.util.Scanner;

public class NameValidation
{
	
	 public static String getValidateNameString(String which)
     {
	  Scanner sc =new Scanner(System.in);
	  String name = null;
	  String inputString;
	  while (name == null)
	  {
           System.out.print("What is your "+ which + " name? ");
           inputString = sc.nextLine();
           if (inputString.length() >= 3)
               name = inputString;
           else
               System.out.println("Please enter at least 3 characters");
	  }
	  return name;
     } 

}
