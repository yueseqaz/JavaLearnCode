package top.x2h.Construction;

public class Skiploopdemo1 {
    public static void main(String[] args) {
         for(int i=0;i<10;i++){
            if(i==5){
                break;//break：结束整个循环。
            }
            System.out.println(i);
        }
    }
}
