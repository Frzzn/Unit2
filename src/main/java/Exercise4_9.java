/*
 * Seth Kelly
 * 9/15/22
 * Exercise 4.9
 * Do stuff and things
 */

import java.util.Scanner;
public class Exercise4_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = input.nextLine().charAt(0);
        System.out.println("The Unicode for the character "+ch+" is "+(int)ch);
        
    }
}
