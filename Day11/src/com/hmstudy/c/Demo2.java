package com.hmstudy.c;

class Animal {
    // int Age = 5;
}

class Dog extends Animal {
    int Age = 10;
}

class Panda extends Animal {
    int Age = 20;
}

class Tiger extends Animal {
    
}


public class Demo2 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Dog dog = new Dog();
        Panda panda = new Panda();
        Tiger tiger = new Tiger();

        feed(animal); // 父类作为参数，子类对象可以作为参数传递，向上转型
        feed(dog); // 父类作为参数，子类对象可以作为参数传递，向上转型
        feed(panda); // 父类作为参数，子类对象可以作为参数传递，向上转型
        feed(tiger); // 父类作为参数，子类对象可以作为参数传递，向上转型

        // System.out.println(getAnimal().getClass());
        Dog dog2 = (Dog)getAnimal();
        // Animal animal2 = getAnimal(); // 父类作为返回值，子类对象可以作为返回值返回，向上转型
        System.out.println(dog2.Age);

    }

    public static void feed(Animal animal) { // 父类作为参数，子类对象可以作为参数传递，向上转型
        System.out.println(animal.getClass() + "来吃饭了");
    }

    public static Animal getAnimal() { // 父类作为返回值，子类对象可以作为返回值返回，向上转型
        Dog dog = new Dog(); // 局部变量，栈内存，方法执行完就销毁，局部变量的作用域就在方法内部
        dog.Age = 20;
        return dog; // 父类作为返回值，子类对象可以作为返回值返回，向上转型
    }

}
