package top.x2h.Review;

import java.util.Scanner;

public class Review1 {
    public static void main(String[] args) {
        double i = 0;
        int month;
        boolean top;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票金额");
        i = sc.nextInt();
        System.out.println("请输入月份");
        month = sc.nextInt();
        System.out.println("请输入是否为头等舱");
        top = sc.nextBoolean();
        if (month >= 5 && month <= 10) {
            if (top) {
                i = i * 0.9;
            } else {
                i = i * 0.85;
            }
        }
        else if ((month >= 1 && month <= 4) ||( month >= 11 && month <= 12)) {
            if (top) {
                i = i * 0.7;
            } else {
                i = i * 0.65;
            }

        }
        else  {
            System.out.println("输入的月份有误");
        }
        System.out.println("机票价格是：" + i);
        System.out.println("你选择的月份是" + month);
        System.out.println("你选择的是头等舱吗？" + top);
        sc.close();
    }
}
//机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
//按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7
//折，经济舱6.5折。