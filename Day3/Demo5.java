import java.util.Scanner;
class Demo5 {
    public static void main(String[] args) {
        /* int num = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个整数：");
        num = sc.nextInt();

        System.out.println("输入的整数是：" + num); */

        char ch = '\0';
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符：");
        ch = sc.nextLine().charAt(0);

        System.out.println("输入的字符是：" + ch);
    }
}