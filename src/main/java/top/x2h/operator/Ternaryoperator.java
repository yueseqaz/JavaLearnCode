/*
Author:X2H
description:ternaryoperator
Notes: ternaryoperator value must be used.
 */
package top.x2h.operator;

import java.util.Scanner;

public class Ternaryoperator {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.println("请输入a的值");
        int a=sc.nextInt();
        System.out.println("请输入b的值");
        int b=sc.nextInt();
        String result=a==b?"same":"different";
        System.out.println(result);
    }
}
