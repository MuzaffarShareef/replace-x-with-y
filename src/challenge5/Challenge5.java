
package challenge5;

import java.util.Scanner;

/**
 * 6027201 
 * Title: Challenge 5
 * Semester COP3804 - Spring 2022
 * Lecturer's name: Cristy Charters
 * Functionality: This program takes a string input from the user
 * and replaces all of the xs with ys.
 * 
 * 
 */
public class Challenge5 {

    /**
     * In main, the program asks the user for a string in a do-while loop and then calls the toY method with the
     * string as the parameter. The program loops if the user enters yes when prompted
     */
    public static String y = "";
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String answer = "yes";
        String before;
        String after;
        do{
            System.out.println("Enter a string:");
            before = scnr.nextLine();
            after = toY(before);
            System.out.println(after);
            System.out.println("Enter 'yes'to continue");
            answer = scnr.nextLine();
            y = "";
        }while(answer.equalsIgnoreCase("yes"));
    }
    
    /**
     * This method takes a String parameter. The base case to exit the method is to check if the 
     * string is empty. The if statement checks if the first character of the string is an 'x'. If it is
     * then a 'y' is concatenated with toY(x.substring(1)). This calls the toY method again using a substring 
     * starting from the second char of the string and the value is saved into the string variable y.
     * In the case that there isn't an x in the first char, the same char is concatenated to y and the
     * method is called again.
     * @param x
     * @return 
     */
    public static String toY(String x){
        if(x.length()==0){
            return y;
        }
        if (x.charAt(0)=='x'){
            y = 'y' + toY(x.substring(1));
            return y;
        }
        y = x.charAt(0) + toY(x.substring(1));
        return y;
    }
    
}
