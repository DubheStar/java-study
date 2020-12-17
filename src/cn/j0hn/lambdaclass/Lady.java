package cn.j0hn.lambdaclass;

public class Lady {
    public static void main(String[] args) {
        new Lady().show(new Pet() {
            @Override
            public void sayHello() {
                System.out.println("miao~");
            }
        });

        //lambda--匿名方法
        new Lady().show(()->System.out.println("ddd"));

    }
    public void show(Pet a){
        a.sayHello();
    }
}
interface Pet{
    public void sayHello();
}