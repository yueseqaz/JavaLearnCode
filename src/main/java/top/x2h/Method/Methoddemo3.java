package top.x2h.Method;

public class Methoddemo3 {
    public static void main(String[] args) {
        sumF(12,21,11);//直接调用方法
        int sum=sumF(12,21,11);//赋值调用
        System.out.println("sum="+sum);
        System.out.println(sumF(12,21,11));//输出调用
    }
    public static int sumF (int a,int b,int c) {
        int sum=a+b+c;//方法体
        return sum;// 返回值 返回给方法的调用处
        //return后面的代码属于无意义的代码 因为方法到return就会结束了。就算方法没有返回值也可以写return

    }
}
//定义有返回值的方法 当需要调用的方法的结果去执行其他操作就用有返回值的方法