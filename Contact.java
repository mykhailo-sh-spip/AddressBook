/*
re-utilised Student class for getting the contact info and printing all contacts

*/
import java.text.*;
import java.util.*;

public class Contact {
    Scanner scan = new Scanner(System.in);
    static ArrayList<String> name = new ArrayList<>();//ArrayList class is a resizeable array, we need it since we'll be continuously adding more contacts
    static ArrayList<String> phone = new ArrayList<>();
    static ArrayList<String> email = new ArrayList<>();
    static ArrayList<String> birthday = new ArrayList<>();//we make it static to be able to use it in all parts of program

    public static void getFileData(String[] contact){//this method is for reading from file when we start the program
        name.add(contact[0]);
        phone.add(contact[1]);
        email.add(contact[2]);
        birthday.add(contact[3]);//convert student score to int and store in int arrayList type
    }

    public static void getValidateBirthday(){
      SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
      //To make strict date format validation
      formatter.setLenient(false);
      Date parsedDate = null;
      loopBD: while (parsedDate==null){
      try {
          String dateInput = IOUtils.getString("enter birthday date in format dd/mm/yyyy: ");
          parsedDate = formatter.parse(dateInput);
          System.out.println("++validated DATE TIME ++"+formatter.format(parsedDate));

      } catch (ParseException e) {
          System.out.println("Invalid date format. Try input again");
          continue loopBD;
      } 
      String strDate = formatter.format(parsedDate);//convert date to String format
      birthday.add(strDate);//add converted date string to array
      }
    }

    public static 
    
    public static void printInfo(int contactCount){//option 5 in address book menu
        for (int i=0; i<contactCount; i++){
            System.out.format("%24s%28s%12s%n", "Name: "+name.get(i), name.get(i)+" "+phone.get(i),"Email: "+email.get(i));
        }
    }
}
