package top.x2h.Construction;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Random r=new Random();
        int i=r.nextInt(100);// 该语句不能写在循环语句里面 随机数的范围 范围就是自0至括号里面的减去1 如果想要修改起始的范围 就把括号后面加多少
        int number;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你才猜测的数字");
        number=sc.nextInt();
        while(number!=i){
            if(number>i){
                System.out.println("你输入的数字太大了");
                number=sc.nextInt();
            }
            else{
                System.out.println("你输入的数字太小了");
                number=sc.nextInt();
            }
            count ++;
            if (count==3){
                System.out.println("你猜的次数已经超过三次");
            }
        }
        System.out.println("恭喜你猜对了");
    }
}