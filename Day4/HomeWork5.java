class HomeWork5 {
    public static void main(String[] args) {
        int num = 12345;

        while (num != 0) {
            System.out.println(num % 10);
            num /= 10;
        }
    }
}