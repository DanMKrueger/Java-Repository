interface Animal{
    public void sound();
    public void feet();
 }

 class Dog implements Animal{
    public void sound(){
     System.out.println("Woof");
    }
    public void feet(){
        System.out.println("The dog has Paws");
    }

}

class Cat implements Animal{
    public void sound(){
        System.out.println("Meow");
    }
    public void feet(){
        System.out.println("The cat has paws");
    }
}

class Horse implements Animal{
    public void sound(){
        System.out.println("The horse makes horse noises");
    }
    public void feet(){
        System.out.println("The horse has hoofs");
    }
}

class AbstractVsInterface{
    public static void main(String args[]){

     Animal myDog = new Dog();
     Animal myCat = new Cat();
     Animal myHorse = new Horse();
     myCat.sound();
     myDog.sound();
     myDog.feet();
     myCat.feet();
     myHorse.feet();
     myHorse.sound();

    }
}

// abstract class Car{
//     Car(){
//         System.out.println("The car started");
//     }
//     abstract void shift();
//     void run(){
//         System.out.println("The car is running");
//     }
// }

// class Impala extends Car{
//     void shift(){
//         System.out.println("The Chevy Impala is no longer running");
//     }
// }

// class AbstractVsInterface{
//     public static void main(String args[]){
//         Car myCar = new Impala();
//         myCar.run();
//         myCar.shift();
//     }
// }