/*
 * Seth Kelly
 * 9/15/22
 * Exercise 4.13
 * Do stuff and things
 */

import java.util.Scanner;
public class Exercise4_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter");
        char letter = input.nextLine().charAt(0);
        letter = Character.toUpperCase(letter);
        if(letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U'){
            System.out.println(letter+" is a vowel");
        }
        else if(Character.isLetter(letter)){
            System.out.println(letter+" is a consonant");
        }
        else{
            System.out.println(letter+" is and invalid input");
        }
    }
}
