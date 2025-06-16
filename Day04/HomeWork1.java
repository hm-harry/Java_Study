import java.util.Scanner;
class HomeWork1 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入两个整数：");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        int ret = 0;

        if (num1 > num2) {
            ret = num1 - num2;
        } else {
            ret = num2 - num1;
        }

        System.out.println("两个数的差绝对值为：" + ret);

    }
}