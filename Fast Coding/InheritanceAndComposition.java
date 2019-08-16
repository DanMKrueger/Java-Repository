abstract class Car{
    abstract void start();
}

class Chevy extends Car{
    public void start(){
        ChevyEngine myEngine = new ChevyEngine();
        myEngine.start();
    }
}

class ChevyEngine{
    public void start(){
        System.out.println("Engine is running");
    }
}

class InheritanceAndComposition{
    public static void main(String args[]) {
        Car impalla = new Chevy();
        impalla.start();
    }
}