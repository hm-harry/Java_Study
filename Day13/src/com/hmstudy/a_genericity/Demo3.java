package com.hmstudy.a_genericity;

interface A<T> {
    void test(T t);
}

/**
 * 泛型类
 * @param <T>
 * 
 */
class TypeB<T> implements A<T> {

    @Override
    public void test(T t) {
        System.out.println("自有模式");
    }
}

class TypeC implements A<String> {

    @Override
    public void test(String t) {
        System.out.println("规矩模式");
    }
}

public class Demo3 {
    public static void main(String[] args) {
        TypeB<Integer> typeB = new TypeB<Integer>();
        typeB.test(123);

        TypeB<Character> typeB2 = new TypeB<Character>();
        typeB2.test('a');

        TypeC typeC = new TypeC();
        typeC.test("123");

    }
}
