interface MyFirstInterface{
    interface NestedInterface{
        public void innerMessage();
    }
    public void outputMessage();
}



class AnonymousExamples{
    static class InnerClass{
        static void printStuff(){
            System.out.println("Inner Class static message");
        }
    }
    public static void main(String args[]){
        AnonymousExamples.InnerClass.printStuff();

        MyFirstInterface fI = new MyFirstInterface(){
            public void outputMessage(){
                System.out.println("First Interface Message");
            }
        };

        MyFirstInterface.NestedInterface nI = new MyFirstInterface.NestedInterface(){
            public void innerMessage(){
                System.out.println("Nested Interface message");
            }
        };

        fI.outputMessage();
        nI.innerMessage();
    }
}