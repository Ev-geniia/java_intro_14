package guru.qa;

public class Dog {
    String name;
    int age;
    boolean isHappy;
    boolean isHungry;

    public Dog(String name, int age, boolean isHappy, boolean isHungry) {
        this.name = name;
        this.age = age;
        this.isHappy = isHappy;
        this.isHungry = isHungry;
    }

    void bark(){
        System.out.println(name + " says 'gav gav'");
    }
    void praise(){
        System.out.println("*** let's praise our dog " + name + " ***");
        System.out.println(name + " is a good boy!");
        if (!isHappy) {
            System.out.println(name + " is happy now");
            isHappy = true;
        } else {
            System.out.println("yay, I'm a good boy!" + ", says " + name);
        }
    }
    void feed() {
        System.out.println("*** let's feed our dog " + name + " ***");
        if (isHungry) {
            System.out.println(name + " says 'thanks for the food:)'");
            bark();
            isHungry = false;
        } else {
            bark();
            System.out.println(name + " says 'nope, just play with me!'");
        }
    }
    void play(){
        System.out.println("*** let's play with our dog " + name + " ***");
        if (age >=1 && age < 10) {
            bark();
            System.out.println(name + " says 'yay, let's play!'");
        } else {
            System.out.println(name + " says 'nope, I don't wanna play, I'm old :('");
        }
    }

}
