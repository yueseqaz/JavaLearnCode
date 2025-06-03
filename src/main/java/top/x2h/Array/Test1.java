package top.x2h.Array;

public class Test1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int count=0;
        //i表示数组里面的每一个索引 arr[i]表示数组了里面的每一个元素
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            if(arr[i]%3==0){
                count++;
            }
        }
        System.out.println("共有"+count+"个能被3整除的数");
    }
}
