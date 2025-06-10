package top.x2h.Method;

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {

     int [] arr= new int[]{1,2,3,4,5};

        System.out.println(Arrays.toString(copyOfRange(arr,1,3)));

    }
    public static int[] copyOfRange(int [] arr,int start,int end){ //如果返回值是一个数组 那么就是int 【】
        int index=0;
        int [] newArr = new int[end-start];
        for (int i=start;i<end;i++){
            newArr[index]=arr[i];
            index++;
        }
        return newArr;

    }
}
