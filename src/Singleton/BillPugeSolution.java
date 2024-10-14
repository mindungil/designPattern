package Singleton;

public class BillPugeSolution {
    private BillPugeSolution() {}

    private static class SingletonHolder {
        private static final BillPugeSolution INSTANCE = new BillPugeSolution();
    }

    public static BillPugeSolution getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

//Thread Safe
//자바 리플렉션과 직렬화를 통해 싱글톤이 파괴될 수 있다.