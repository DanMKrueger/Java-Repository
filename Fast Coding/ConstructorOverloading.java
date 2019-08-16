class Car{

    Car(){
        System.out.println("I am a car");
    }
    Car(String myCar){
        System.out.println("I am a " + myCar);
    }
    Car(int myInt){
        System.out.println("I have " + myInt + " cars");
    }
    public void honk(){
        System.out.println("Honk");
    }
    public void trunk(){
        System.out.println("I have a little trunk space");
    }
    public void trunk(String myTrunkString){
        System.out.println("I have " + myTrunkString +  " trunk space!");
    }
}


class ConstructorOverloading{
    public static void main(String args[]){
        Car myHonda = new Car("Honda");
        Car myNewCar = new Car();
        myHonda.trunk();
        myHonda.trunk("tons of");
    }
}