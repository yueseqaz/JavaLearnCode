package top.x2h.Construction;

public class Fordemo2 {
    public static void main(String[] args) {
        int i;
        int count=0;
        for(i=1;i<=100;i++){
            if (i%3==0 && i%5==0){
                System.out.println("i="+i);
                count++;
            }


        }
        System.out.println( "count="+count);
    }
}
