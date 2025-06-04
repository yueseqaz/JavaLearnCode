package top.x2h.Method;

public class Test2 {
    public static void main(String[] args) {
        int spring=getSum(12,21,11);
        int summer=getSum(22,25,11);
        int fall=getSum(15,26,11);
        int winter=getSum(16,27,11);
        System.out.println("sum="+spring);
        System.out.println("sum="+summer);
        System.out.println("sum="+fall);
        System.out.println("sum="+winter);
    }
    public static int getSum(int a,int b,int c){
        int sum=a+b+c;
        return sum;
    }
}
//计算每个季度的季度得营业额