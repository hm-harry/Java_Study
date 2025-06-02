class Demo8 {
    public static void main(String[] args) {
        int i = 0;

        while (i < 10) {
            System.out.println(i);
            i++;
            if (5 == i) {
                System.out.println("continue");
                continue;
            }
        }

        for (int j = 0; j < 10; j++) {
            if (5 == j) {
                System.out.println("continue");
                continue;
            }
            System.out.println(j);
        }

    }
}