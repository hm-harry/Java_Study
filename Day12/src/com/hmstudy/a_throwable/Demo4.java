package com.hmstudy.a_throwable;

public class Demo4 {
    public static void main(String[] args) 
        throws ArithmeticException, NullPointerException{ // 抛出异常，由JVM处理
        // 调用一个带有异常抛出的方法

        // 调用一个带有异常抛出的方法

        // 捕获处理
        try {
            test(10, 2, null);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        test(10, 0, null);
    }

    /**
     * 测试方法
     * @param num1 被除数
     * @param num2 除数
     * @param arr 数组
     * @throws ArithmeticException 算数异常
     * @throws NullPointerException 空指针异常
     * */
    public static void test(int num1, int num2, int[] arr) 
        throws ArithmeticException, NullPointerException{
        // 方法体中，抛出异常对象，由方法的调用者处理
        if (0 == num2) {

            throw new ArithmeticException("算数异常");
        }

        if (null == arr) {
            throw new NullPointerException("空指针异常");
        }

        System.out.println(num1 / num2);
        arr[0] = 10;
    }
}
