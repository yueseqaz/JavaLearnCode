package top.x2h.Method;

import javax.swing.*;

public class Test4 {
    public static void main(String[] args) {
    int  [] arr = {1,2,3,4,5};
        System.out.print("[");
    array(arr);
        System.out.print("]");
    }
    public static void array(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if (i<arr.length-1){
            System.out.print(",");}
            else{
                System.out.print("");
            }
        }

        }
    }

