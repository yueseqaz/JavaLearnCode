package top.x2h.Construction;

import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        int i;
        Scanner sc= new Scanner(System.in);
        System.out.print("plz enter a value：");
        i=sc.nextInt();
        while (i<=100){
           if(i%7 ==0 || (i%10==7 || (i/10)%10==7)){
               System.out.println("i="+i);
           }
           i++;
        }
    }}
//找出7的倍数或者包含7的 数字