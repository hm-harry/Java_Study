import java.util.Scanner;
class HomeWork5 {
    public static void main(String[] args) {
        int total = 0;
        int choose = 0;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("1.可乐 2.雪碧 3.芬达 4.退出");
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("可乐3元");
                    total += 3;
                    break;
                case 2:
                    System.out.println("雪碧2元");
                    total += 2;
                    break;
                case 3:
                    System.out.println("芬达1元");
                    total += 1;
                    break;
                case 4:
                    System.out.println("退出");
                    flag = true;
                    break;
                default:
                    System.out.println("选择错误");
            }

            if (flag) {
                System.out.println("您的消费金额为：" + total + "元");
                break;
            }
        } while (true);
    }
}