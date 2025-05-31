package top.x2h.Construction;

import java.util.Scanner;

public class Ifdemo2 {
    public static void main(String[] args) {
        String light;
        Scanner sc= new Scanner(System.in);
         System.out.print("plz enter light status：");
          light=sc.next();
           if (light.equals("red")){
              System.out.println("stop");
          }
          else if (light.equals("yellow")){
              System.out.println("caution");
          }
          else if (light.equals("green")){
              System.out.println("go");
          }
          else {
              System.out.println("plz enter right light status");
          }

    }
}
