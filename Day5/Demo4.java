import java.util.Scanner;
class Demo4 {
    public static void main(String[] args) {
        double sum = showMenuAndGetTotalPrice();
        System.out.println("您的消费金额为：" + sum + "元");
    }

    /**
     * 展示菜单的方法
     */
    public static void showMenu() {
        System.out.println("1.可乐 2.雪碧 3.芬达 4.退出");
    }

    /**
     * 展示菜单处理用户选择，返回用户点餐的总价
     */
    public static double showMenuAndGetTotalPrice() {
        showMenu();
        double total = 0;
        int choose = 0;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("请输入序号：");
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
                break;
            }
        } while (true);
        return total;
    }
}