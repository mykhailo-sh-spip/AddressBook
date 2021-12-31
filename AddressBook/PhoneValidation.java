package AddressBook;

import java.util.Scanner;

public class PhoneValidation
{
	 public static boolean checkDigits(String stringToCheck)
     {
	  boolean bAllDigits = true;
	  int n = stringToCheck.length();
	  for (int i = 0; i < n; i++)
	  {
	      if (!Character.isDigit(stringToCheck.charAt(i)))
	      {
		  bAllDigits = false;
		  break;
	      }
	  }
	  return bAllDigits;
     }
	 public static String getValidatePhone()
     {
	  String phone = null;
	  String inputString;
	  while (phone == null)
	  {
		  Scanner sc=new Scanner(System.in);
	      System.out.println("What is your mobile phone (10 digits)? ");
	      inputString = sc.nextLine();
	      if (inputString.length()  != 10)
		  System.out.println("Phone number must be 10 digits");
	      else
	      {
                 if (checkDigits(inputString))
                   phone = inputString;
                 else
                   System.out.println("Phone number must be all digits");
	      }
	  }
	  return phone;
     }

}
