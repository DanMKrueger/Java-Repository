/*class OuterClass{

    // The scope of the private class InnerClass is contained within the class OuterClass, so it is protected from anything else 
    private class InnerClass{
        public void print(){
            System.out.println("You are in the inner class!");
        }
    }
    // The printInnerClass below is within the class OuterClass, so it is able to see the private class InnerClass.
    void printInnerClass(){
        InnerClass inner = new InnerClass();
        inner.print();
    }

}

public class InnerClasses{
    public static void main(String args[]){
        OuterClass outerObject = new OuterClass();
        outerObject.printInnerClass();
    }
}*/

//---------------------------------------------------------------------------------------------

// class MySecondOuterClass{

//     int x = 64;

//     static class MySecondInnerClass{
//         int y = 92;
//     }
// }

// public class InnerClasses{
//     public static void main(String args[]){
//         MySecondOuterClass.MySecondInnerClass myInnerClass = new MySecondOuterClass.MySecondInnerClass();
//         System.out.println(myInnerClass.y);
//     }
// }

/*************************************************************************************/

class Fish{
    int co2 = 50, o2 = 60;

    private class Gill{
        public void breath(){
            o2 += 50;
            co2 -= 50;
            System.out.println("O2 level: " + o2);
            System.out.println("CO2 level: " + co2);
        }
    }

    public void takeABreath(){
        Gill newGill = new Gill();
        newGill.breath();
    }
}

public class InnerClasses{
    public static void main(String args[]){
        Fish betta  = new Fish();
        betta.takeABreath();
    }
}