package top.x2h.Method;

public class Test5 {
    public static void main(String[] args) {
        int [] arr=  {1,2,3,4,5};
        System.out.println("最大值为："+compare(arr));

    }
    public static int compare(int [] arr) {
      int max=arr[0];
      for (int i=0;i<arr.length;i++){
          if (arr[i]>max){//这种比大小的思路可以记住就是比武 最开始的时候有一个擂主 即我们的擂主是数组的第一个元素 后面有很多人想要挑战 挑战的人就是我们数组中的元素 挑战的人和擂主进行比较 哪个大就让擂主换为那个元素
              max=arr[i];
          }
      }
      return max;
    }}

