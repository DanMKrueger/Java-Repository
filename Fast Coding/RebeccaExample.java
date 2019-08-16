class ModifierExamples{
    private String myString = " Hiden ";
    public String myString2 = " Public ";
    protected String myString3 = " Protected ";
    public void returnStuff(){
        System.out.println(myString);
    }
}

class SubClassExample extends ModifierExamples{
    public void returnStuff(){
        System.out.println(myString2 + " " + myString3 + " ");
    }
}


class RebeccaExample{
    public static void main(String args[]){
        ModifierExamples myExample = new SubClassExample();
        myExample.returnStuff();
        ModifierExamples myObj = new ModifierExamples();
        myObj.returnStuff();
    }
}