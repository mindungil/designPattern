package Singleton;

public class Singleton {
    private static Singleton singletonObj;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(singletonObj == null) {
            singletonObj = new Singleton();;
        }

        return singletonObj;
    }
}

//객체의 인스턴스가 단 하나만을 생성하도록 하는 디자인패턴
//private 생성자를 가져야함.
//단일 객체 참조 변수는 static 이어야하고 getInstance() 메서드 참조.
