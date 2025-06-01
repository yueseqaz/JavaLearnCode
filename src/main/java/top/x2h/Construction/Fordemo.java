package top.x2h.Construction;

public class Fordemo {
    public static void main(String[] args) {
        int i;
        int sum=0;
        for(i=1;i<=100;i++){
            if ( i%2==0){
               sum += i;
            }
        }
        System.out.println("sum="+sum);
    }
}
