package top.x2h.Array;

public class Arraydemo {
    public static void main(String[] args) {
        //隶属于静态初始化
        int[] a=new int[]{5,6,7,8};//数据类型 [] 数组名=new 数组类型[数组长度] 完整格式
        int [] b={5,6,7,8};//数据类型 [] 数组名={元素1，元素2，元素3，元素4} 简化格式
        String[] c=new String[]{"x2h","x2h","x2h"};
        String[] d={"x2h","x2h","x2h"};
        double[] e=new double[]{5.5,6.6,7.7,8.8};
        double[] f={5.5,6.6,7.7,8.8};
        System.out.println(a[0]);//5
        System.out.println(a);//输出的是数组的地址值
        a[0]=100;//这里将100赋给数组的第一个元素 原先的值就会被覆盖
        System.out.println(a[0]);//100

        //隶属于动态初始化
        int[] arr=new int[4];//数据类型  [] 数组名=new 数组类型[数组长度]
        arr[0]=5;
        arr[1]=6;
        arr[2]=7;
        System.out.println(arr[0]);//5
        System.out.println(arr[3]);//0 默认值
        //数组默认初始化值： 整数类型：0   小数类型：0.0    布尔类型：false     字符类型/引用数据类型 ：null 字符类型：\u0000

    }}
//动态初始化与静态初始化区别：
// 静态初始化：数组长度确定，数组元素确定，初始化完成之后，不能再修改数组长度和数组元素
//动态初始化：数组长度确定，数组元素不确定，初始化完成之后，可以再修改数组元素