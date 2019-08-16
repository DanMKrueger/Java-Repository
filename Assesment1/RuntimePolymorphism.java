class MyAssesmentClass{
    void print(){
        System.out.println("This is the basic text");
    }
}

class MySubClass extends MyAssesmentClass{
    void print(){
        System.out.println("This message over-wrote the other!");
    }
}

class RuntimePolymorphism{
    public static void main(String args[]){
        MyAssesmentClass newObj = new MySubClass();
        newObj.print();
    }
}