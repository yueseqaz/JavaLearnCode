package top.x2h.Method;

import java.util.Scanner;

public class Methoddemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数");
        sumf( sc.nextInt(),sc.nextInt());//此处的参数称为实参

    }
    public static void sumf(int a,int b){//此处的参数称为形参
        int sum = a+b;
        System.out.println(sum);
    }
}
//带参数的方法