import java.util.Scanner;
class Demo4 {
    public static void main(String[] args) {
        double sum = showMenuAndGetTotalPrice();
        System.out.println("�������ѽ��Ϊ��" + sum + "Ԫ");
    }

    /**
     * չʾ�˵��ķ���
     */
    public static void showMenu() {
        System.out.println("1.���� 2.ѩ�� 3.�Ҵ� 4.�˳�");
    }

    /**
     * չʾ�˵������û�ѡ�񣬷����û���͵��ܼ�
     */
    public static double showMenuAndGetTotalPrice() {
        showMenu();
        double total = 0;
        int choose = 0;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("��������ţ�");
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("����3Ԫ");
                    total += 3;
                    break;
                case 2:
                    System.out.println("ѩ��2Ԫ");
                    total += 2;
                    break;
                case 3:
                    System.out.println("�Ҵ�1Ԫ");
                    total += 1;
                    break;
                case 4:
                    System.out.println("�˳�");
                    flag = true;
                    break;
                default:
                    System.out.println("ѡ�����");
            }

            if (flag) {
                break;
            }
        } while (true);
        return total;
    }
}