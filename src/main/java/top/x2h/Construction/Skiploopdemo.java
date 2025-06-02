package top.x2h.Construction;

public class Skiploopdemo {
    public static void main(String[] args) {
         for(int i=0;i<10;i++) {
             if (i == 5) {
                 continue;//continue：跳过本次循环，继续执行下次循环。
             }
             System.out.println(i);
         }
    }
}
//  输出结果：0 1 2 3 4 6 7 8 9 跳过了 5 continue的作用就是结束本次循环 ，进入下一次循环