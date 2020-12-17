package cn.j0hn.jihe;

import java.time.temporal.Temporal;

public class VarTest {
    static int a =10;
    int b =20;
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(VarTest.a);
        System.out.println(new VarTest().b);
        System.out.println(new VarTest().a);
    }
}

interface One{

}
