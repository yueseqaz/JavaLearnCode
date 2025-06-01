/*
初始化语句；
while（条件判断语句）{
循环体语句 ；
条件控制语句；
}

初始化语句；
do｛
循环体语句；
条件控制语句；
｝while（条件判断语句）；只有当while的条件为true时，循环体才会执行，当while的条件为false时，循环体不再执行 但在此之前 do while循环体会执行一次

for 和 while 的区别：
> for循环中，控制循环的变量，因为归属for循环的语法结构中，在for循环结束后，就不能再次被访问到了
> while循环中，控制循环的变量，对于while循环来说不归属其语法结构中，在while循环结束后，该变量
还可以继续使用

for 和 while 的区别：
> for循环中：知道循环次数或者循环的范围
> while循环：不知道循环的次数和范围，只知道循环的结束条件。
 */
package top.x2h.Construction;

public class Whiledemo {
    public static void main(String[] args) {
        int i=1;
         while(i<=100){
            System.out.println("i="+i);
            i++;
        }

    }
}
