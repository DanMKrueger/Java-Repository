import java.util.Scanner;

class FastCoding{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String enteredText = obj.nextLine();
        String mySub = enteredText.substring(enteredText.length()-3, enteredText.length());
        System.out.println(mySub + enteredText + mySub);
        obj.close();
    }
}