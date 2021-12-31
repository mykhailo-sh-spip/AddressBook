
package AddressBook;

import java.io.StringReader;
import java.util.Formatter;
import java.util.Scanner;
import java.util.regex.Pattern;
public class EmailValidation
{
	

	public static String getValidateEmail(String which)
    {
		Scanner sc = new Scanner (System.in);
	  String email = null;
	  String inputString;
	  String pattern;
	  boolean EmailValidation;
	  while (email == null)
	  {
          System.out.print("What is your "+ which + " email? ");
          inputString = sc.nextLine();
          pattern="\"^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@\" \r\n"
          		+ "        + \"[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$\";";
          EmailValidation=pattern.matches(inputString);
          if (EmailValidation!=false)
              email = inputString;
          else
              System.out.println("Please enter a valid email address");
	  }
	  return email;
    } 

	

}
