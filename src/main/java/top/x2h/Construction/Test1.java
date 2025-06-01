package top.x2h.Construction;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int i;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        i=sc.nextInt();
        int temp=i;
       while(i!=0){
           int bit= i%10;
           i=i/10;
           sum= sum*10+bit;
       }
       if(temp==sum){
           System.out.println("你输入的数是回文数");
       }
       else {
           System.out.println("你输入的数不是回文数");
       }

    }
}
//此案例为判断一个数是否为 回文数