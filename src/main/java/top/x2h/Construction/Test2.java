package top.x2h.Construction;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
         int i;
          int j;
          int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个被除数");
         i=sc.nextInt();
         System.out.println("请输入一个除数");
          j=sc.nextInt();
         while(i>=j){
             i=i-j;
             count++;
         }
          System.out.println("商是"+count+"余数是"+i);
    }
}
//此案例为给定一个被除数和除数 在仅仅使用加减法的情况下 得出余数和商