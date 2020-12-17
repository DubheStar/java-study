package cn.j0hn.lambdaclass;

interface A {
    public abstract void test(int a, int b);
}

public class NoNameInnerClassDemo {

    public static void main(String[] args) {
        new NoNameInnerClassDemo().show((a,b) -> System.out.println("DABDc "));
    }

    public void show(A a) {
        a.test(3,5);
    }
}
