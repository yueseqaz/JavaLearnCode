package top.x2h.Review;

import java.util.Random;

public class Review3 {
    public static void main(String[] args) {
        System.out.println(getString());
    }
    public static String  getString() {
        String yzm;
        Random  random = new Random();
        int x = random.nextInt(10);
        String [] str=new String[52];
        for (int i=0;i<str.length;i++) {
            if (i < 26) {
                str[i] = String.valueOf((char) ('a' + i));
            } else {
                str[i] = String.valueOf((char) ('A' + i - 26));
            }
            System.out.print(str[i]);
        }
        System.out.println(" ---------------------------------");
         random.nextInt(str.length);
         yzm=str[random.nextInt(str.length)]+str[random.nextInt(str.length)]+str[random.nextInt(str.length)]+str[random.nextInt(str.length)]+x;
        return yzm;
    }
}
//生成验证码 由四个随机大小写的字母和一个数字组成