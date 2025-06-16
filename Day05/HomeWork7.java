class HomeWork7 {
    public static void main(String[] args) {
        
    }

    /** 
     * 封装一个方法，传入一个整数，判断该数是否为数字字符
     * 如果是数字字符，返回true，否则返回false
     * 
     * @param c 要判断的字符
     * @return  如果是数字字符，返回true，否则返回false
     */
    public static boolean isNumber(char c) {
        return c >= '0' && c <= '9';
    }

    /**
     * 封装一个方法，来判断一个字符是否是英文字母
     * 如果是英文字母，返回true，否则返回false
     * @param c 要判断的字符
     * @return 如果是英文字母，返回true，否则返回false
     * 
     */
    public static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    /**
     * 封装一个方法，传入一个字符，如果是大写那么就转小写，然后返回
     * 否则保持不变
     * @param c 要转换的字符
     * @return 如果是大写，返回小写，否则返回原字符
     * 
     */
    public static char toLower(char c) {
        if (c >= 'A' && c <= 'Z') {
            c += ('a' - 'A');
        }
        return c;
    }
}