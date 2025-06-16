class Demo7 {
    public static void main(String[] args) {
        int i = 10;

        while (i > 0) {
            System.out.println(i);
            i--;

            if (5 == i) {
                System.out.println("find" + i);
                break;
            }
        }

        int j = 10;

        do {
            System.out.println(j);
            j--;
            
            if (5 == j) {
                System.out.println("find" + j);
                break;
            }
        } while (j > 0);

        for (int k = 0; k < 10; k++) {
            System.out.println(k);

            if (5 == k) {
                System.out.println("find" + k);
                break;
            }
        }
    }
}