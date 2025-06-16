class Demo2 {
    public static void main(String[] args) {
        int num = 0;

        System.out.println("Before call the method:" + num);
        num = giveMeFive();
        System.out.println("After call the method:" + num);
    }

    /**
     * 返回一个int类型数据5
     * 
     * @return 返回一个int类型数据5
     */
    public static int giveMeFive() {
        if (true) {
            return 5;
        } else {
            return 10;
        }
    }
}