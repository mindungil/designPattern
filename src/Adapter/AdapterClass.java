package Adapter;

public class AdapterClass implements Adapter{
    Math math = new Math();
    @Override
    public int sum(int a, int b) {
        return (int)math.sum((float)a,(float)b);
    }
    public int mul(int a, int b) {
        return (int)math.mul((float)a,(float)b);
    }
}
