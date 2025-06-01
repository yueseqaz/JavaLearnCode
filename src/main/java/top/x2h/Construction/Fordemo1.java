/*
for(初始化语句；条件判断语句；条件控制语句){
循环体语句
}
 */
package top.x2h.Construction;

public class Fordemo1 {
    public static void main(String[] args) {
        int i;
        int sum=0;//求和的变量不能够写在循环内 否则每次循环都会被初始化
        for(i=1;i<=5;i++){
            System.out.println("hello world");//print hello world 5 times
            System.out.println("i="+i);//print i
            sum+=i;
            System.out.println("sum="+sum);
        }
    }
}
