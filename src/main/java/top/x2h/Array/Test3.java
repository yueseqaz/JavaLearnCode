package top.x2h.Array;

public class Test3 {
    public static void main(String[] args) {
        int arr[]={12,21,13,11,314,141,11,41,111,89};
        int max=arr[0];//索引数组里面的任意一个元素 但从第一个开始的话 下面循环可以少一次 不能赋值0 因为涉及负数就不准确了
        for(int i=1;i<arr.length;i++){
            System.out.println(arr[i]);
          if(arr[i]>max){
              max=arr[i];
          }

        }
        System.out.println("max value:" + max);
    }
}
//求数组当中的最大值