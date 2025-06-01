import java.util.Scanner;
class Demo9 {
    public static void main(String[] args) {
        int choose = 0;
        Scanner Sc = new Scanner(System.in);

        System.out.println("1.·ÊÕ¬¿ìÀÖË®");
        System.out.println("2.ÕäÖéÄÌ²è");
        System.out.println("3.ºì²èÄÃÌú");
        System.out.println("4.ºÚÌÇÕäÖéÄÌ²è");
        System.out.println("ÇëÊäÈëÄãµÄÑ¡Ôñ£º");

        choose = Sc.nextInt();

        switch (choose) {
            case 1:
                System.out.println("ÄãÑ¡ÔñÁË·ÊÕ¬¿ìÀÖË®");
                break;
            case 2:
                System.out.println("ÄãÑ¡ÔñÁËÕäÖéÄÌ²è");
                break;
            case 3:
                System.out.println("ÄãÑ¡ÔñÁËºì²èÄÃÌú");
                break;
            case 4:
                System.out.println("ÄãÑ¡ÔñÁËºÚÌÇÕäÖéÄÌ²è");
                break;
            default:
                System.out.println("ÊäÈëÓĞÎó");
        }


    }
}