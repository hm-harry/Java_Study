class Demo1 {
    public static void main(String[] args) {
        printIntNumber(5);
        printSumOfTwoNumber(5, 6);
    }
    
    /**
     * 展示int类型数据的方法
     * 
     * @param num 要求用户传入的int类型数据
     */
    public static void printIntNumber(int num) {
        System.out.println("用户提供的int类型数据为：" + num);
    }

    /**
     * 打印两个int类型数据的和
     * 
     * @param num1 要求用户传入的第一个int类型数据
     * @param num2 要求用户传入的第二个int类型数据
     */
    public static void printSumOfTwoNumber(int num1, int num2) {
        System.out.println("两个int类型数据的和为：" + (num1 + num2));
    }
}