public class Animal {
    private final String name;
    private final short age;
    private String sound;

    public Animal(String name, short age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name,short age, String sound){
        this.name = name;
        this.age = age;
        this.sound = sound;
    }
    short getAge(){
        return this.age;
    }

    String getName(){
        return this.name;
    }

    protected static boolean isAlive(){
        return true;
    }

    void makeSound(){
        System.out.println(this.sound);
    }

    protected void eat(){
        System.out.println(this.name + " is eating.");
    }

    protected void eat(String food){
        System.out.println(this.name + " is eating " + food + ".");
    }
}
