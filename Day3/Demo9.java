import java.util.Scanner;
class Demo9 {
    public static void main(String[] args) {
        int choose = 0;
        Scanner Sc = new Scanner(System.in);

        System.out.println("1.��լ����ˮ");
        System.out.println("2.�����̲�");
        System.out.println("3.�������");
        System.out.println("4.���������̲�");
        System.out.println("���������ѡ��");

        choose = Sc.nextInt();

        switch (choose) {
            case 1:
                System.out.println("��ѡ���˷�լ����ˮ");
                break;
            case 2:
                System.out.println("��ѡ���������̲�");
                break;
            case 3:
                System.out.println("��ѡ���˺������");
                break;
            case 4:
                System.out.println("��ѡ���˺��������̲�");
                break;
            default:
                System.out.println("��������");
        }


    }
}