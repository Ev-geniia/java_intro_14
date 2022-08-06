package guru.qa;

public class First {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Sharik", 1, true, true);
        Dog dog2 = new Dog("Bobik", 10, false, true);
        Dog dog3 = new Dog("Barbos", 5, false, false );

        dog1.feed();
        dog1.play();
        dog1.praise();
        dog2.feed();
        dog2.play();
        dog2.praise();
        dog3.feed();
        dog3.play();
        dog3.praise();
    }
}
