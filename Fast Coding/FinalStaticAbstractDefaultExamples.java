interface MyInterface{
    default void newMethod(){
        System.out.println("Printing from inside the interface!");
    };
    static void myStaticMethod(){
        System.out.println("Printing new static method!");
    };
    abstract void abVoid();
}

class MyClass implements MyInterface{
    public void abVoid(){
        System.out.println("Inside the abstract void!");
    }
    final void myFinalVoid(){
        System.out.println("Final stuff here");
    }
}

class SubClass extends MyClass{
    public void abVoid(){
        System.out.println("Printing from the overwritten abVoid!");
    }
    // final void myFinalVoid(){
    //     System.out.println("Errors going on here");
    // }
}

class FinalStaticAbstractDefaultExamples{
    public static void main(String args[]){
        MyClass obj = new MyClass();
        obj.newMethod();
        MyInterface.myStaticMethod();
        obj.abVoid();
        obj.myFinalVoid();

        SubClass mySubClass = new SubClass();
        mySubClass.abVoid();
    }
}