import java.util.Scanner;
class Demo5 {
    public static void main(String[] args) {
        /* int num = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("������һ��������");
        num = sc.nextInt();

        System.out.println("����������ǣ�" + num); */

        char ch = '\0';
        Scanner sc = new Scanner(System.in);

        System.out.println("������һ���ַ���");
        ch = sc.nextLine().charAt(0);

        System.out.println("������ַ��ǣ�" + ch);
    }
}