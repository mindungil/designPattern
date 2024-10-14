package Singleton;

public class Client {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
           Singleton singleton = Singleton.getInstance();
           System.out.println(singleton);
        });

        Thread thread2 = new Thread(() -> {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton);
        });

        Thread thread3 = new Thread(() -> {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton);
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

//Thread Safe 하지 않음.
//싱글톤 객체가 두번 초기화되어 서로 다른 주소를 참조함.
