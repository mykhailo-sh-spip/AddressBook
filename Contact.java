import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.io.*;

public class Contact {
    Scanner scan = new Scanner(System.in);
    static ArrayList<String> name = new ArrayList<>();//ArrayList class is a resizeable array, we need it since we'll be continuously adding more contacts
    static ArrayList<String> phone = new ArrayList<>();
    static ArrayList<String> email = new ArrayList<>();
    static ArrayList<String> birthday = new ArrayList<>();//we make it static to be able to use it in all parts of program

    public static void getFileData(String[] contact){//this method is for reading from file (challenge 1)...not completed yet
        name.add(contact[0]);
        phone.add(contact[1]);
        email.add(contact[2]);
        birthday.add(contact[3]);//convert student score to int and store in int arrayList type
    }

    public static void getValidateName(){ //menu option 1 pt1
      String validName = null;
      String inputString;
      while (validName == null)
      {
        inputString = IOUtils.getString("Enter name: ");
        if (inputString.length() >= 3){
          validName = inputString;
          } else {
          System.out.println("Please enter at least 3 characters");
          }
      }
      name.add(validName);
    }

    public static void getValidateEmail(){
      String validEmail = null;
      String inputString;
      while (validEmail == null)
      {
        inputString = IOUtils.getString("Type email here: ");
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputString);
        if (matcher.matches())
            validEmail = inputString;
        else
            System.out.println("Please enter a valid email address");
      }
      email.add(validEmail);
    }


    public static boolean checkDigits(String stringToCheck){//auxillary to phone number validation
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
    public static void getValidatePhoneNumber(){//menu option 1 pt3
      String validPhone = null;
      String inputString;
      while (validPhone == null)
      {
          inputString = IOUtils.getString("Enter phone number (10 digits): ");
          if (inputString.length()  != 10)
        System.out.println("Phone number must be 10 digits");
          else
          {
            if (checkDigits(inputString))
              validPhone = inputString;
            else
              System.out.println("Phone number must be all digits");
          }
      }
      phone.add(validPhone);//instead of return phone we just add validated phone value straight into our "phone" array list 
    }

    public static void getValidateBirthday(){ //menu option 1 pt4
      SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
      formatter.setLenient(false);//To make strict date format validation
      Date parsedDate = null;

      loopBD: while (parsedDate==null){
      try {
          String dateInput = IOUtils.getString("enter birthday date in format dd/mm/yyyy: ");
          parsedDate = formatter.parse(dateInput);
          //System.out.println("++validated DATE TIME ++"+formatter.format(parsedDate));

      } catch (ParseException e) {
          System.out.println("Invalid date format. Try input again");
          continue loopBD;
      } 

      String strDate = formatter.format(parsedDate);//convert date to String format
      birthday.add(strDate);//add converted date string to array
      }
    }


    
    public static void printInfo(int contactCount){//menu option 5
        for (int i=0; i<contactCount; i++){
            //24s for name, 16s for phone number, 23s for email, 15s for birthday
            System.out.format("%24s%16s%23s%15s%n", "Name: "+name.get(i), " Phone number:"+phone.get(i)," Email: "+email.get(i), " BD: "+birthday.get(i));
        }
    }
}
