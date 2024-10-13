package Strategy;

import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Sound sound = new Sound();

        sound.setSound(new Cow());
        sound.bark();

        sound.setSound(new Dog());
        sound.bark();

        sound.setSound(new Cat());
        sound.bark();

        new inputStream();
    }
}
