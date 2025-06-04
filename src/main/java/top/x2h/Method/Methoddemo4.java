package top.x2h.Method;

public class Methoddemo4 {
    public static void main(String[] args) {
        sumF(12,21,11);
        sumF(12,21);
    }
    public static int sumF (int a,int b,int c)
    {
        int sum = a+b+c;
        return sum;
    }
    public static int sumF (int a,int b)
    {
        int sum = a+b;
        return sum;
    }//虽然有两个相同的方法，但是参数不同，这个叫做方法重载。方法是否构成重载，只需要在方法名相同的情况下 ，参数个数、参数的类型、参数的顺序不同即可。
}
