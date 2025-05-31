/*
  * @Author: X2H
  * note: This ia about nested if statement
 */
package top.x2h.Construction;

import java.util.Scanner;

public class Ifdemo3 {
    public static void main(String[] args) {
        int ticket;
        Scanner sc =new Scanner(System.in);
        System.out.println("plz enter ticket number");
        ticket=sc.nextInt();
        if (ticket>=1&& ticket<=100){
            if(ticket%2==1){
                System.out.println("your sit at right");
            }
            else {
                System.out.println("your sit at left");
            }
        } else
            System.out.println("plz enter right ticket number");
    }
}
