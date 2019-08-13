class PrintAndSubstr{
    public static void main(String args[]){
        
        System.out.print("This is printed seperately ");
        System.out.print("than this");

        System.out.println("\nThis is on one line");
        System.out.println("This is on another\n");

        String classExample = "Racecar";
        System.out.println(classExample.substring(4,classExample.length()));

        String myString1 = "Fire";
        String myString2 = "truck";
        String concatString = myString1.concat(myString2);
        System.out.println(concatString);

    }
}