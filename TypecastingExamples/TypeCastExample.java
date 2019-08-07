public class TypeCastExample{

    public static void main(String args[]){

        // Widening typecasting (Upcasting) is automatic. When you take something and convert it to something bigger/longer it is done automatically.
        // byte -> short -> char -> int -> long -> float -> double
        int newInt = 7;
        double newDouble = newInt;
        System.out.println(newDouble);

        // Narrowing typecasting (Downcasting) is not automatic. If you want to take something and make it smaller you must cast it yourself.
        // double -> float -> long -> int -> char -> short -> byte
        double newerDouble = 10.35;
        byte newByte = (byte) newerDouble;
        System.out.println(newByte);

        // Another Widening below
        // Due to Byte being smaller than Float, Java will automatically typecast it for us.
        byte newerByte = 90;
        float newFloat = newerByte;
        System.out.println(newFloat);

    }
}