package top.x2h.Construction;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        i=sc.nextInt();
        for(int number=2;number<i;number++){
            if(i%number==0){
                System.out.println("你输入的数不是质数");
                break;
            }


        }System.out.println("你输入的数是质数");
    }
}
