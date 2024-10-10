package Strategy;

public class Main {
    public static void main(String[] args) {
        Sound sound = new Sound();

        sound.setSound(new Cow());
        sound.bark();

        sound.setSound(new Dog());
        sound.bark();

        sound.setSound(new Cat());
        sound.bark();
    }
}
