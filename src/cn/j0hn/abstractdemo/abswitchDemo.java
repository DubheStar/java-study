package cn.j0hn.abstractdemo;

public class abswitchDemo {
    public static void main(String[] args) {
        numbers a = new numbers();
        numbers b = new numbers();
        a.setNum(4);
        b.setNum(3);
        math.switchfunction(a,b);
        System.out.println(a.value);
        System.out.println(b.value);
    }
}
