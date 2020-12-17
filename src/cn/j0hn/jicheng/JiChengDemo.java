package cn.j0hn.jicheng;

public class JiChengDemo {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.eat();
        System.out.println(t.age);
    }
}

class Teacher extends Person {
    double salary;
}

class Student extends Person {
    double score;
}

class SuperPerson {
    double height;
}

class Person extends SuperPerson{
    String name;
    int age;
    char gender;

    public void eat() {
        System.out.println("吃");
    }
}