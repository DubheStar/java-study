package cn.j0hn.desginpattern;

public class HunterSingelonDemo {
    public static void main(String[] args) {
        HungerSingelton s1 =HungerSingelton.getInstance();
        HungerSingelton s2 =HungerSingelton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}
