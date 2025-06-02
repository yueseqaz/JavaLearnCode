package top.x2h.Construction;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        i=sc.nextInt();
        for(int num=1;num<i; num++){
            if(num*num==i){
                System.out.println( "平方根是"+num);
                break;
            }
            else if (num *num> i){
                System.out.println((num-1) + "平方根的整数部分");
                break;
            }
            }
            }
        }
//求一个整数的平方根或者平方根的整数部分