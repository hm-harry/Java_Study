class HomeWork7 {
    public static void main(String[] args) {
        
    }

    /** 
     * ��װһ������������һ���������жϸ����Ƿ�Ϊ�����ַ�
     * ����������ַ�������true�����򷵻�false
     * 
     * @param c Ҫ�жϵ��ַ�
     * @return  ����������ַ�������true�����򷵻�false
     */
    public static boolean isNumber(char c) {
        return c >= '0' && c <= '9';
    }

    /**
     * ��װһ�����������ж�һ���ַ��Ƿ���Ӣ����ĸ
     * �����Ӣ����ĸ������true�����򷵻�false
     * @param c Ҫ�жϵ��ַ�
     * @return �����Ӣ����ĸ������true�����򷵻�false
     * 
     */
    public static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    /**
     * ��װһ������������һ���ַ�������Ǵ�д��ô��תСд��Ȼ�󷵻�
     * ���򱣳ֲ���
     * @param c Ҫת�����ַ�
     * @return ����Ǵ�д������Сд�����򷵻�ԭ�ַ�
     * 
     */
    public static char toLower(char c) {
        if (c >= 'A' && c <= 'Z') {
            c += ('a' - 'A');
        }
        return c;
    }
}