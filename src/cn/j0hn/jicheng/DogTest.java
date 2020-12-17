package cn.j0hn.jicheng;

public class DogTest {
    public static void main(String[] args) {

    }
}

class Dog {
    String name;
    int age;
    char gender;
    String furColor;

    public void lookDoor() {
        System.out.println("汪汪汪");
    }
}

class ChinaDog extends Dog {
    String eyesColor;
}

class USADog extends Dog {
    double weight;
}

