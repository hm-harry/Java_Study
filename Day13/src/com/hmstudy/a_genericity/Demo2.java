package com.hmstudy.a_genericity;

class TypeA<T> {
    /**
     * 
     * @param t
     * @return
     */
    public T test1(T t) {
        return t;
    }

    public void test2(T t1, T t2) {
        System.out.println(t1);
        System.out.println(t2);
    }

    public static <E> E staticMethod(E e) {
        return e;
    }
}

public class Demo2 {
    public static void main(String[] args) {
        TypeA<String> typeA = new TypeA<String>();
        String test1 = typeA.test1("北京烤鸭");
        typeA.test2("烤肉", "火锅");

        TypeA<Demo2> typeA2 = new TypeA<Demo2>();

        Demo2 test12 = typeA2.test1(new Demo2());
        typeA2.test2(new Demo2(), new Demo2());

        // 不推荐
        TypeA typeA3 = new TypeA();
    }
}
