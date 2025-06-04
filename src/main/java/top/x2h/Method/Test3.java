package top.x2h.Method;

public class Test3 {

    public static void main(String[] args) {
        int l1=square(12,21);
        int l2=square(22,25);
        if(l1>l2){
            System.out.println("l1="+l1);
        }else{
            System.out.println("l2="+l2);
        }
    }
    public static int square(int a,int b){
       int c = a*b;
       return c;
    }}
//打印出面积较大的长方体