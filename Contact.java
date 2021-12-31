/*
re-utilised Student class for getting the contact info and printing all contacts

*/
import java.util.ArrayList;//for appending elements to arrays

public class Contact {
    static ArrayList<String> id = new ArrayList<>();//ArrayList class is a resizeable array, we need it since we'll be continuously adding more students
    static ArrayList<String> name = new ArrayList<>();
    static ArrayList<String> surname = new ArrayList<>();
    static ArrayList<Integer> score = new ArrayList<>();//we make it static to be able to use it in all parts of program

    public static void getInfo(String[] student){//option 1 in address book menu
        id.add(student[0]);
        name.add(student[1]);
        surname.add(student[2]);
        score.add(Integer.parseInt(student[3]));//convert student score to int and store in int arrayList type
    }

    public static void printInfo(int studentCount){//option 5 in address book menu
        for (int i=0; i<studentCount; i++){
            System.out.format("%24s%28s%12s%n", "Student ID: "+id.get(i), name.get(i)+" "+surname.get(i),"Grade: "+Integer.toString(score.get(i)));
        }
    }
    p
    
}
