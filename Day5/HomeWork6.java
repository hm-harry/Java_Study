class HomeWork6 {
    public static void main(String[] args) {
        int ret = maxOfNumber(10, 20);
        System.out.println(ret);
    }

    public static int maxOfNumber(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }

    public static int minOfNumber(int num1, int num2) {
        return num1 < num2 ? num1 : num2;
    }

    public static boolean isMyUpper(char c) {
        return c >= 'A' && c <= 'Z';
    }
}