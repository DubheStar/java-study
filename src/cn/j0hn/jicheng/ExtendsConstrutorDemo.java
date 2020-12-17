package cn.j0hn.jicheng;

public class ExtendsConstrutorDemo {
    public static void main(String[] args) {
        SonClass sc = new SonClass();
    }
}

class FatherClass {
    static {
        System.out.println("调用父类静态代码块");
    }

    {
        System.out.println("调用父类构造代码块");
    }

    public FatherClass() {
        System.out.println("调用父类无参构造方法");
    }

    public FatherClass(String name) {
        System.out.println("调用父类有参构造方法");
    }
}

class SonClass extends FatherClass {
    static {
        System.out.println("调用子类静态代码块");
    }

    {
        System.out.println("调用子类构造代码块");
    }

    public SonClass() {
        super("123");
        System.out.println("调用子类无参构造方法");
    }

    public SonClass(String aaa) {
        System.out.println("调用子类有参构造方法");
    }
}