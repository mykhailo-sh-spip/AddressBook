/*
re-utilised Student class for getting the contact info and printing all contacts

*/
import java.util.Scanner;
import java.util.ArrayList;
//for appending elements to arrays

public class Contact {
    static ArrayList<String> birthday = new ArrayList<>();// ArrayList class is a resizeable array, we need it since
															// we'll be continuously adding more students
	static ArrayList<String> name = new ArrayList<>();
	static ArrayList<String> surname = new ArrayList<>();
	static ArrayList<Integer> phonenumber = new ArrayList<>();// we make it static to be able to use it in all parts of program
  
	public static void getInfo(String[] student)
	{// option 1 in address book menu
		Scanner sc= new Scanner(System.in);
		birthday.add(student[0]);
		name.add(student[1]);
		surname.add(student[2]);
		phonenumber.add(Integer.parseInt(student[3]));// convert phone number to int and store in int arrayList type
		String delete;
		int order;
		System.out.println("which contact do you want to delete?(Type in the number of the order of people)");
		delete=sc.nextLine();
		try
		{
			order=Integer.parseInt(delete);
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Please enter a valid number");
		}
		System.out.println("Are you sure you want to delete this contact?(true/false)");
		String answer;
		boolean obj =false;
		answer=sc.nextLine();
		try
		{
			obj=Boolean.parseBoolean(answer);
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Please enter a valid answer");
		}
		if(obj==true)
		{
			
		}
		else
		{
			
		}
		
	}

	public static void printInfo(int studentCount)
	{// option 5 in address book menu
		for (int i = 0; i < studentCount; i++)
		{
			System.out.format("%24s%28s%12s%n", "Student ID: " + birthday.get(i), name.get(i) + " " + surname.get(i),
					"Grade: " + Integer.toString(phonenumber.get(i)));
		}

	}
}
