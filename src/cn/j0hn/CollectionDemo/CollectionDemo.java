package cn.j0hn.CollectionDemo;


import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        List<Person> person = new ArrayList<>();

        person.add(new Person("张三", 23, '男'));
        person.add(new Person("张三", 23, '男'));
        person.add(new Person("李四", 24, '女'));
        person.add(new Person("王五", 25, '男'));

        System.out.println(person);

        for(Person per : person ){
            System.out.println(per);
        }
    }

    static class Person {
        String name;
        int age;
        char gender;

        public Person(String name, int age, char gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "{name:\"" + name + "\", age:\"" + age + "\", gender:\"" + gender + "\"}";
        }
    }
}
