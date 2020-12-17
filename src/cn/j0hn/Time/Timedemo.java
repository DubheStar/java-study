package cn.j0hn.Time;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Timedemo {
    public static String timeNow;
    public static void main(String[] args) {
        String text= "2020-09-03T07:09:13.922Z";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println(sdf.format(text));
    }
}
