class Demo1 {
    public static void main(String[] args) {
        printIntNumber(5);
        printSumOfTwoNumber(5, 6);
    }
    
    /**
     * չʾint�������ݵķ���
     * 
     * @param num Ҫ���û������int��������
     */
    public static void printIntNumber(int num) {
        System.out.println("�û��ṩ��int��������Ϊ��" + num);
    }

    /**
     * ��ӡ����int�������ݵĺ�
     * 
     * @param num1 Ҫ���û�����ĵ�һ��int��������
     * @param num2 Ҫ���û�����ĵڶ���int��������
     */
    public static void printSumOfTwoNumber(int num1, int num2) {
        System.out.println("����int�������ݵĺ�Ϊ��" + (num1 + num2));
    }
}