package cn.j0hn.lambdaclass;

public class PersonTest {
    public static void main(String[] args) {
        new PersonDemo().show(new Person() {
            @Override
            public void action() {
                System.out.println("1213");
            }
        });
    }
}

abstract class Person{
    public abstract void action();
}

class PersonDemo{
    public void show(Person p){
        p.action();
    }
}