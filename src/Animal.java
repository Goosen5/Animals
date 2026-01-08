public class Animal {
    private String name;
    private short age;
    private String sound;

    public Animal(String name, short age) {
        this.name = name;
        this.age = age;
    }

    public void Animal(String name,short age, String sound){
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

    void makeSound(){
        System.out.println(this.sound);
    }
}
