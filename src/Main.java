void main() {
    //Cow Test
    Cow cow = new Cow("Ylan", (short) 19);
    System.out.println(cow.getName() + " " + cow.getAge());
    cow.eat();
    cow.eat("grass");
    cow.play();

    //Dog Test
    Dog dog = new Dog("Loïc", (short) 19);
    System.out.println(dog.getName() + " " + dog.getAge());
    dog.eat();
    dog.eat("chicken");
    dog.play();

    //Encapsualtion test
    //Don't have access
    //System.out.println(dog.name); //Private
    //System.out.println(cow.age); //Private
    //System.out.println(dog.sound); //Private
    //have access
    System.out.println(dog.getName()); //Public
    System.out.println(cow.getAge()); //Public
    System.out.println(Animal.isAlive()); //Protected



}