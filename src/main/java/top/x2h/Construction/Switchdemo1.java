package top.x2h.Construction;

import java.util.Scanner;

public class Switchdemo1 {
    public static void main(String[] args) {
        int  month;
         Scanner sc =new Scanner(System.in);
          System.out.println("plz enter month number");
           month=sc.nextInt();
           switch (month){
               case 1 ->
                   System.out.println("your month is January");//只有一行代码的时候 {}可以省略

               case 2 -> {
                   System.out.println("your month is February");
               }
                case 3 -> {
                   System.out.println("your month is March");
               }
               case 4 -> {
                   System.out.println("your month is April");
               }
                case 5 -> {
                   System.out.println("your month is May");
               }
                case 6 -> {
                    System.out.println("your month is June");
                }
                 case 7 -> {
                    System.out.println("your month is July");
                }
                 case 8 -> {
                     System.out.println("your month is August");
                 }
                  case 9 -> {
                     System.out.println("your month is September");
                 }
                  case 10 -> {
                     System.out.println("your month is October");
                 }
                  case 11 -> {
                      System.out.println("your month is November");
                  }

                   case 12 -> {
                      System.out.println("your month is December");
                  }
               default ->  {
                   System.out.println("plz enter right month number");
               }
           }


    }
}
