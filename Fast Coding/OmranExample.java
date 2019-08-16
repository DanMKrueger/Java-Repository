import java.lang.StringBuilder;

class Onion{
    static StringBuilder sb = new StringBuilder();
    public static void onionMethod(){
        String onion = "I have an onion.";
        sb.append(onion);
    }
}

class CutOnion extends Onion{
    public static void cutMethod(){
        String cut = "I have cut the onion.";
        sb.append(cut);
    }
}

class FryOnion extends Onion{

}


class OmranExample{
    public static void main(String args[]){
        int myInt = -9;
        System.out.println("My number is: " + myInt + "  Absolute value: " + java.lang.Math.abs(myInt));

    }
}