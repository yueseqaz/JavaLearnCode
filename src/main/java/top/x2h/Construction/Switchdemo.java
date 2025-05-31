package top.x2h.Construction;

import java.util.Scanner;

public class Switchdemo {
    public static void main(String[] args) {
        String week;
        Scanner sc= new Scanner(System.in);
        System.out.print("plz enter week：");
         week=sc.next();
          switch (week){
//             case "mon":
//                 System.out.println("workday1");
//                 break; //break千万不能省略 如果省略 就会导致case穿透 直至遇到break或者}为止
//             case "tue":
//                 System.out.println("workday2");
//                 break;
//             case "wed":
//                 System.out.println("workday3");
//                 break;
//             case "thu":
//                 System.out.println("workday4");
//                 break;
//             case "fri":
//                 System.out.println("workday5");
//                 break;
              case "mon" , "tue", "wed", "thu", "fri":
                 System.out.println("workday"); //当多个case值相同时 可以用逗号隔开
                 break;
             case "sat":
                 System.out.println("don't work");
                 break;
             case "sun":
                 System.out.println("don‘t work");
                 break;
                  default://此处的default可以省略 在语法上没有任何问题 但是不建议 而且default不一定写在最后面 在任何地方都可以 只是习惯在最后
                     System.out.println("plz enter right week");
          }
    }
}
