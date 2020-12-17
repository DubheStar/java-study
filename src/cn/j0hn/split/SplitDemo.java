package cn.j0hn.split;

public class SplitDemo {
    private static final String characterArray = "abcdefg  hijklmn opqrst uvwxyz";

    public static void main(String[] args) {
        String[] characterArrayList = SplitDemo.characterArray.split("\\W+");
        System.out.println();
        for ( String character: characterArrayList){
            System.out.println(character);
        }
    }
}
