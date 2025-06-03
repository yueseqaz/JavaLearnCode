package top.x2h.Array;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int []arr=new  int[10];
        int sum=0;
        Scanner sc=new Scanner(System.in);//这一句如果放在循环里面就会造成资源浪费
        for (int i=0;i<arr.length;i++){
            System.out.println("请输入第"+(i+1)+"个数字");

            arr[i]=sc.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);//遍历数组
            sum+=arr[i];
        }
        System.out.println("和为："+sum);
        System.out.println("平均数为："+sum*1.0/arr.length);
        for(int i=0;i<arr.length;i++){
            if(arr[i]<sum*1.0/arr.length){
                System.out.println("小于平均数的数字为："+arr[i]);
            }
        }
        sc.close();//关闭输入流
    }
}
//  输入10个数字，求和，求平均数，并输出小于平均数的数字