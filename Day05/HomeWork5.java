import java.util.Scanner;
class HomeWork5 {
    public static void main(String[] args) {
        int total = 0;
        int choose = 0;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("1.���� 2.ѩ�� 3.�Ҵ� 4.�˳�");
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
                System.out.println("�������ѽ��Ϊ��" + total + "Ԫ");
                break;
            }
        } while (true);
    }
}