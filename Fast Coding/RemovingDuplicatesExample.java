import java.util.Set;
import java.util.HashSet;

class RemovingDuplicatesExample{

    public static void main(String args[]){
        Integer[] myArray = {2, 7, 3, 9, 4, 3, 8, 7, 8, 8, 8, 2};
        Set<Integer> items = new HashSet<>();
        for(Integer i : myArray){
            items.add(i);
        }
        System.out.println(items);
    }
}