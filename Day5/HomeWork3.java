class HomeWork3 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        int sum = 0;

        System.out.print("1 1 ");
        for (int i = 1; i <= 28; i++) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.print(sum + " ");
        }
        System.out.println();
    }
}