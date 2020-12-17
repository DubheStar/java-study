package cn.j0hn.regex;

public class RegexDemo {
    public static void main(String[] args) {
        String QQNum= "123456";
        CheckQQRegex(QQNum);
    }
    public static boolean CheckQQ(String qq){
        if(qq.length()>5 &&qq.length()<=10){
            if(!qq.startsWith("0")){
                for (int i=0;i<qq.length();i++){
                    if(!Character.isDigit(qq.charAt(i))){
                        return false;
                    }
                }
                return false;
            }
        }
        return false;
    }
    public static void CheckQQRegex(String qq){
        if (qq.matches("\\d{6,9}")){
            System.out.println("IsQQ");
        }
    }
}
