public class Dog extends Animal{
    public Dog(String name, short age){
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food.");
    }
}
