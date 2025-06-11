package top.x2h.Review;

import java.util.Scanner;

public class Review5 {
    public static void main(String[] args) {
        int [] score=new int [6];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<score.length;i++){
            System.out.println("请输入第"+(i+1)+"个评委的成打分");
            score[i]=sc.nextInt();
            System.out.println("第"+(i+1)+"个评委的给出的成绩是"+score[i]);
        }
        int max=getMax(score);
        int min=getMin(score);
        int sum=getSum(score)-max-min;
        int avg=sum/4;
        System.out.println("最高分是"+max);
        System.out.println("最低分是"+min);
        System.out.println("总分是"+sum);
        System.out.println("去掉最值后平均分是"+avg);
        sc.close();
    }
    public static int getMax(int[] score){
        int max=score[0];
        for(int i=0;i<score.length;i++){
            if(score[i]>max){
                max=score[i];
            }
        }
        return max;
    }
    public static int getMin(int[] score){
        int min=score[0];
        for(int i=0;i<score.length;i++){
            if(score[i]<min){
                min=score[i];
            }
        }
        return min;
    }
    public static int getSum(int[] score){
        int sum=0;
        for(int i=0;i<score.length;i++){
            sum+=score[i];
        }
        return sum;
    }
}
//六个评委打分 去掉最值后求平均分
//经验：善用方法