package cn.j0hn.desginpattern;

public class HungerSingelton {
    private static HungerSingelton st =new HungerSingelton();

    private HungerSingelton(){}

    public static HungerSingelton getInstance(){
        return st;
    }
}
