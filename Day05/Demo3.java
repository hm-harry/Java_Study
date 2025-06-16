class Demo3 {
    public static void main(String[] args) {
        int  sum = 0;

        System.out.println("Before call the method:" + sum);
        sum = sumOfTwoNumber(5, 6);
        System.out.println("After call the method:" + sum);
    }

    /**
     * 计算两个int类型数据的和，并且通过返回值返回
     * 
     * @param num1 要求用户传入的第一个int类型数据
     * @param num2 要求用户传入的第二个int类型数据
     * @return 返回两个int类型数据的和
     */
    public static int sumOfTwoNumber(int num1, int num2) {
        return num1 + num2;
    }
}