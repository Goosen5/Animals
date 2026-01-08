void main() {
    Cow cow = new Cow("Ylan", (short) 19);
    System.out.println(cow.getName() + " " + cow.getAge());
    cow.eat();
    cow.eat("grass");

    Dog dog = new Dog("Loïc", (short) 19);
    System.out.println(dog.getName() + " " + dog.getAge());
    dog.eat();
    dog.eat("chicken");

}