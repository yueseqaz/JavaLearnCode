package top.x2h.Array;

public class Arraydemo1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int  num=0;
        // 遍历数组中的所有元素
        for(int i=0;i<arr.length;i++){// 数组名.length表示获取数组长度
            System.out.println(arr[i]);
            num+=arr[i];// 求数组中所有元素的和

        }
        System.out.println("数组中所有元素的和为："+num);
    }
}
