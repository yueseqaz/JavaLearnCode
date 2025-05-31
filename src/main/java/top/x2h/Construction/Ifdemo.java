/*
This is a demo about if statement.
Note: When you use an if statement, always wrap the code block with {}.
The condition in if must be a boolean type. Avoid using = (assignment) or == (equality check).
Prefer using boolean variables directly.
 */

package top.x2h.Construction;
import java.util.Scanner;

public class Ifdemo {
    public static void main(String[] args) {
    int payment;
    Scanner sc= new Scanner(System.in);
    System.out.print("plz enter payment：");
    payment=sc.nextInt();
    if (payment>600){
        System.out.println(" success payment ");
    }
     else {
        System.out.println("sorry ,plz again ");
     }
    }
}
