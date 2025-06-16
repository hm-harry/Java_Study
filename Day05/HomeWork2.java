class HomeWork2 {
    public static void main(String[] args) {
        int num = 90;

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
                num = num / i;
                i--;
            }
        }
    }
}