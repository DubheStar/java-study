package cn.j0hn.StudentSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudengSortDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Yi",3,3));
        list.add(new Student("Er",3,2));
        list.add(new Student("San",4,3));

        Collections.sort(list,(a,b)->b.getAge()-a.getAge());
        System.out.println(list);
    }
}
