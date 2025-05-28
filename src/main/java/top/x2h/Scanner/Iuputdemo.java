/*
 * 1. 基本数据类型相关 nextXXX() 方法
 * 这些方法用于读取各种基本数据类型的输入。
 * 注意：这些方法不会读取换行符 '\n'，容易导致后续的 nextLine() 被跳过。
 */
// int: 读取一个整数（例如：25）
// double: 读取一个双精度浮点数（例如：65.5）
// float: 读取一个单精度浮点数
// long: 读取一个长整型数值
// short: 读取一个短整型数值
// boolean: 读取布尔值（true / false）

/*
 * 2. 字符串相关 next() 方法
 * 这些方法用于读取字符串类型的输入。
 */
// String: 读取一个单词（以空白字符为分隔符，不包含换行）
// String: 读取一整行输入（包括空格，直到遇到换行符 '\n'）
// nextLine() 会“吃掉”当前缓冲区中的换行符，是处理字符串推荐的方式。

/*
 * 3. 其他常用方法
 * 提供了一些额外的功能来增强输入处理能力。
 */
// boolean: 判断是否有下一个指定类型的输入（例如：hasNextInt()）
// char: 读取一个字符（常用于性别、选项等简单输入，例如 next().charAt(0)）

package top.x2h.Scanner;

import java.util.Scanner;

public class Iuputdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年龄：");
        int age = sc.nextInt();
        sc.nextLine(); //  处理缓存区的回车 只有当nextxxx后接接nextLine()时才需要
        System.out.print("请输入姓名：");
        String name = sc.nextLine();
        System.out.println("请输入你的体重");
        double weight = sc.nextDouble();
        System.out.println("请输入你的性别");
        char sex = sc.next().charAt(0);
        System.out.println("你的名字是" + name + "，年龄是" + age + "，体重是" + weight + "，性别是" + sex);

    }
}
