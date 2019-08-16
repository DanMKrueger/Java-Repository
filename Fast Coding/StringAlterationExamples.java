import java.util.Scanner;
import java.io.*;

class StringAlterationExamples{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Please type any sentence!");
        String enteredLine = obj.nextLine();
        while(!enteredLine.equals("stop")){
            int vowelCount = 0;
            String allVowels = "";
            System.out.println("Your sentence was: " + enteredLine);
            for(int i = 0; i < enteredLine.length(); i++){
                if(enteredLine.charAt(i) == 'a' || enteredLine.charAt(i) == 'e' || enteredLine.charAt(i) == 'i' || enteredLine.charAt(i) == 'o' || enteredLine.charAt(i) == 'u' || enteredLine.charAt(i) == 'A' || enteredLine.charAt(i) == 'E' || enteredLine.charAt(i) == 'I' || enteredLine.charAt(i) == 'O' || enteredLine.charAt(i) == 'U'){
                    vowelCount++;
                    String temp = Character.toString(enteredLine.charAt(i));
                    allVowels += temp.toUpperCase();
                }
            }
            System.out.println("Vowel count: " + vowelCount);
            System.out.println("All Vowels: " + allVowels);
            System.out.println("Please enter \"stop \" to stop");
            enteredLine = obj.nextLine();
        }
    }
}