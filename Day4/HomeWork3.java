class HomeWork3 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i += 2) {
            if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
                System.out.println("¹ý");
                continue;
            }
            System.out.println(i);
        }
    }
}