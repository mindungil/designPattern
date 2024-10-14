package Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance3);

        System.out.println(instance1 == instance2);
    }
}

//생성자 호출이 private하게 이루어짐
//        > 한 번만 호출 할 수 있으므로 인스턴스가 전역에 1개
//        > (유일한 인스턴스)
//        > 메모리 절약 및 생성자와 인스턴스가 동시에 생성되어 비용감소
