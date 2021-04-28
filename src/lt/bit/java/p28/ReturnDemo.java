package lt.bit.java.p28;

public class ReturnDemo {

    private int y;

    public static void main(String[] args) {
        ReturnDemo returnDemo = new ReturnDemo();
        returnDemo.add(100);
        returnDemo.add(-20);
    }

    void add(int x) {
        if (x < 0) {
            return;
        }
        y = y + x;
        return;
    }

    Integer div(int x) {
        if (x != 0) {
            int a = y / x;
            return a;
        }
        System.out.println("Kuku");
        return null;
    }
}
