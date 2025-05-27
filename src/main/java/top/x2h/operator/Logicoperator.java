/*
Author: Sakura
Date: 2025/05/26
Notice:&& and & ,  || and |, they  are different
for example: false  && A is false, but false & B is false,outcome is same!
you should know the difference between them.
 && is short-circuit operator,so A is not evaluated.
 & is not short-circuit operator,so B is evaluated.
 */

package top.x2h.operator;
public class Logicoperator {
    public static void main(String[] args) {
       //  Logical AND, we can understand .if any one is false then it will be false
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println("------------------------------------");
        // Logical OR ,we can understand .if any one is true then it will be true
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println("------------------------------------");
        // Logical NOT .  it will reverse the value
        System.out.println(!true);
        System.out.println(!false);
        System.out.println("------------------------------------");
        // Logical XOR .we can understand, if two value are same, it will return false
        System.out.println(true^true);
        System.out.println(true^false);
        System.out.println(false^true);
        System.out.println(false^false);
        System.out.println("------------------------------------");
        System.out.println("the example will display short circuit and not short circuit difference");
        int a = 10;
        int b = 20;
        int c = 10;
        int d = 20;
        boolean result = ++a>10 || ++b>20 ;
        boolean outcome=  ++c>10 | ++d>20;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
        System.out.println(outcome);
        System.out.println(c);
        System.out.println(d);
    }
}
