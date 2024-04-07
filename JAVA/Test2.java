abstract class demo {
    public int a;

    demo() {
        a = 10;
    }

    abstract public void set();

    abstract final public void get();
}

class Test2 extends demo {
    public void set(int a) {
        this.a = a;
    }

    final public void get() {
        System.out.println("a = " + a);
    }

    public static void main(String[] args) {
        Test2 obj = new Test2();
        obj.set(20);
        obj.get();
    }
}