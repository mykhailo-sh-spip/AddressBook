/*
tasks for Toi Eik:
1. Make a functional menu (do as many functions as you can) 
print menu
if choice = 1: add contact() (Contact.getInfo)
if choice = 2: look up contact()
...
if choice = 5: print all() - Contact.printInfo
2. 

*/

import AddressBook.*;
import java.util.Scanner;

public class Main{
    private static Scanner scan = new Scanner(System.in);

    public static void mainMenu(){
        System.out.println("----------------------");
        System.out.println("1.Add a new contact. ");
        System.out.println("2.Look up the contact based on name");//after look up we will ask "what do you want to do with contact you found? delete / modify / do nothing(go back)"
        //look up is going to loop through array of names and every time it finds the name it will record that name into separate array together with this name's index (number in array)
        /*example list: 
        [index 0] misha 1234567890 misha@misha.com 1/1/1
        [index 1] misha 0987654321 misha@gmail.com 2/2/2
        [index 2] toi eik 1234567890 toiek@gmail.com 3/3/3
        we execute look up function--
        type name you want to search for: misha
        searching......
        
        */
        System.out.println("3.Print all contacts ");
        System.out.println("4.Exit ");

    }

    public static void main(String[] args) {
        int contactCount = 0;
        loop1: while (true){//while loop is given custom label "loop1"
          mainMenu();
          String choice = IOUtils.getString("What do you want to do?: ");
          switch (choice){
            case "1": //adding new contact
              Contact.getValidateName();
              Contact.getValidatePhoneNumber();
              Contact.getValidateEmail();
              Contact.getValidateBirthday();
              System.out.println("contact added successfully");
              contactCount++;
              continue loop1;
            case "2":

            case "3": //print all contacts
              Contact.printInfo(contactCount);
            case "4":
              //after we do file challenge before exit we will also have to write the changes to the file
              break loop1;
            default: //works like else for switch
              System.out.println("Invalid input, please try again");
              continue loop1;
          }
        }
        
    }
}

     