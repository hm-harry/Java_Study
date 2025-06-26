package com.hmstudy.a_throwable;

class NoGirlFriendException extends Exception {
    public NoGirlFriendException() {

    }
    public NoGirlFriendException(String message) {
        super(message);
    }
}
public class Demo5 {
    public static void main(String[] args) throws NoGirlFriendException {
        try {
            buyOneFreeOne(true);
        } catch (NoGirlFriendException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        buyOneFreeOne(false);
    }

    /**
     * 买一送一
     * @param singleDog 单身狗
     * @throws NoGirlFriendException 没有女朋友异常
     * */
    public static void buyOneFreeOne(boolean singleDog) throws NoGirlFriendException {
        if(singleDog) {
            throw new NoGirlFriendException("单身狗不能买一送一"); // 抛出异常对象，由方法的调用者处理
        }
        System.out.println("买一送一");
    }
}
