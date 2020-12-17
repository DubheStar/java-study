package cn.j0hn.jicheng;

public class ExtendDemo {
    public static void main(String[] args) {
        Demo d =new Demo();
        LittleDemo ld =new LittleDemo();
        System.out.println(d.name);
        ld.show("王五");
    }
}

class Demo {
    String name = "张三";
}

class LittleDemo extends Demo {
    String name = "李四";
    int age = 10;
    public void show(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
