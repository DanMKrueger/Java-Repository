class MoreFastCoding{
    public static void main(String args[]){
        int[] myArray = {5, 7, 2, 4, 9};
        int evens = 0;
        int odds = 0;

        for(int i = 0; i<myArray.length; i++){
            if(myArray[i] % 2 == 0){
                evens++;
            }
            else{
                odds++;
            }
        }
        System.out.println("The amount of even numbers in the array is: " + evens);
        System.out.println("The amount of odd numbers in the array is: " + odds);
    }
}