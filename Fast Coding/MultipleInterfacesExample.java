interface Pet{
    void noise();
}

interface Dog extends Pet{
    void barking();
}

interface BigDog extends Pet, Dog{
    void sleeping();
}

class ChocolateLab implements Dog{
    public void noise(){
        System.out.println("Making noise");
    }
    public void barking(){
        System.out.println("Dog is barking");
    }
}

class GreatDane implements BigDog{
    public void noise(){
        System.out.println("Big dog is making noise");
    }
    public void barking(){
        System.out.println("Big dog is barking");
    }
    public void sleeping(){
        System.out.println("Big dog is sleeping");
    }
}

class MultipleInterfacesExample{
    public static void main(String args[]){
        Dog myPet = new ChocolateLab();
        myPet.noise();
        myPet.barking();
        BigDog myGreatDane = new GreatDane();
        myGreatDane.noise();
        myGreatDane.barking();
        myGreatDane.sleeping();
    }
}