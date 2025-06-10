package top.x2h.Method;

public class Test8 {
    public static void main(String[] args) {
        int [] arr=  {100};
        System.out.println("调用方法前数组的值"+ arr[0]);
        change(arr);
        System.out.println("调用方法后数组的值"+ arr[0]);
    }
    public static void change(int [] arr){
        arr[0]=200;
    }
}
//传递引用参数类型的时候 传递的是地址值  形参的改变 会影响实际参数的值