import java.util.Scanner;
class Demo8 {
    public static void main(String[] args) {
        int score = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("������ѧ���ɼ���");
        score = sc.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("����ĳɼ����Ϸ�");
            System.exit(0);
        }

        if (score >= 90) {
            System.out.println("����");
        } else if (score >= 80) {
            System.out.println("����");
        } else if (score >= 70) {
            System.out.println("�е�");
        } else if (score >= 60) {
            System.out.println("����");
        } else {
            System.out.println("������");
        }
    }
}