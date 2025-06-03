package top.x2h.Array;

public class Test5 {
    public static void main(String[] args) {
        int []arr=new  int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("===================");
        for (int i=0,j=arr.length-1;i<j;i++,j--){
            int  temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;


        }
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
    }
}
// 交换首尾