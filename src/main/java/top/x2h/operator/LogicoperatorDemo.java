/*Number 6 is a truly great number, typing two integers on the keyboard.
If one of them is 6, the final result outputs true.
If their sum is a multiple of 6. The final result outputs true.
All other situations are false.
 */
package top.x2h.operator;
import java.util.Scanner;

public class LogicoperatorDemo {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner Sc = new Scanner(System.in);
        System.out.println("请输入a的值");
        a=Sc.nextInt();
        System.out.println("请输入b的值");
        b=Sc.nextInt();
       if ((a+b)%6==0 | (a==6 | b==6))
           System.out.println("true");
       else
           System.out.println("false");


    }
}
