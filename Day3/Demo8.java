import java.util.Scanner;
class Demo8 {
    public static void main(String[] args) {
        int score = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生成绩：");
        score = sc.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("输入的成绩不合法");
            System.exit(0);
        }

        if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 80) {
            System.out.println("良好");
        } else if (score >= 70) {
            System.out.println("中等");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }
}