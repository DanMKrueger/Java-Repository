interface Numbers{
    void printEvens(int[] array);
}

class LambdaExample{
    public static void main(String args[]){
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8};
        
        Numbers evens = (array) -> {
            for(int i = 0; i < myArray.length; i++){
                if(array[i] %2 == 0){
                    System.out.println("The even numbers are " + i);
                }
            }
        };
    }
}