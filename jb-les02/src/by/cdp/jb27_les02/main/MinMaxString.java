package by.cdp.jb27_les02.main;            // create a package  
import java.util.Scanner;                 //import the library
public class MinMaxString {                 //create new class 
public static void main(String[] args) {
int n = 10;                                 //set qty of lines to enter
Scanner sc = new Scanner(System.in);        //create an object sc of Scanner class for reading inputs from console
String max = "", min = "", str = "";        //initialize max, min,str variables of String type with empty values 
for (int i = 0; i < n; i++) {            //for i<n
System.out.print("> ");                  //print ">"
if (sc.hasNextLine()) {                 //check if next line was entered correctly
	str = sc.nextLine();                //set entered value to str variable
if (i == 0) {
min = str;                              //at the beginning set str to min variable
}
if (str.length() > max.length()) {      //if any of new string is longer then max then 
max = str;                                 //that string is considered as max
} else if (str.length() < min.length()) {   //if any of new string is shorter then min
min = str;                                    //that string is considered as min
}
}
}
System.out.println("max string = " + max + " length=" + max.length()); //print max line with its value
System.out.println("min string = " + min + " length=" + min.length()); //print min line with its value 
}
}
