class Demo3 {
    public static void main(String[] args) {
        int  sum = 0;

        System.out.println("Before call the method:" + sum);
        sum = sumOfTwoNumber(5, 6);
        System.out.println("After call the method:" + sum);
    }

    /**
     * ��������int�������ݵĺͣ�����ͨ������ֵ����
     * 
     * @param num1 Ҫ���û�����ĵ�һ��int��������
     * @param num2 Ҫ���û�����ĵڶ���int��������
     * @return ��������int�������ݵĺ�
     */
    public static int sumOfTwoNumber(int num1, int num2) {
        return num1 + num2;
    }
}