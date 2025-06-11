package top.x2h.Review;

public class Review2 {
    public static void main(String[] args) {
        int count=0;
        for (int j = 101; j < 200; j++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(j); i++) {
                if (j % i == 0) {
                    isPrime = false;
                    break;//这里的跳出循环是跳出内层循环，而不是外层循环
                }

            }
            if (isPrime) {
                System.out.println("是质数: " + j);
                count++;

            }
        }
        System.out.println("质数个数：" + count);
    }
}
//求一个数字是不是质数的方法就是遍历1到sqrt(n)，如果能整除就返回false，否则返回true