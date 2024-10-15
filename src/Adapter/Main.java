package Adapter;

public class Main {
    public static void main(String[] args) {
        AdapterClass adapter = new AdapterClass();
        System.out.println("sum : " + adapter.sum(1,2));
        System.out.println("mul : " + adapter.mul(1,2));
    }
}


//클라이언트의 요구타입, 반환타입이 달라도 어댑터 패턴을 활용하여 적절히 맞출 수 있다.

