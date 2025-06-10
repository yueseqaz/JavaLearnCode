package top.x2h.Method;

public class Test7 {
    public static void main(String[] args) {
        int a=100;
        System.out.println("调用方法前" + a);//100
        change(a);
        System.out.println("调用方法后" + a);//100
    }
    public static void change(int a){
        a=200;
        System.out.println("方法中" + a);
    }//方法都是存在栈中 调用完成后就会销毁 蓑衣此处的a是方法中的a
}
//传递基本参数类型的时候 传递的是真实数据  形参的改变 不影响实际参数的值