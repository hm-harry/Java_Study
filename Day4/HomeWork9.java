class HomeWork9 {
    public static void main(String[] args) {
        int line = 15;
        int topline = (line + 1) / 2; // 5
        int bottomline = line - topline; // 4

        for (int i = 1; i <= topline; i++) {
            for (int j = 1; j <= topline - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 1; i <= bottomline; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= line - 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}