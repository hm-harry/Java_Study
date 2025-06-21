package com.hmstudy.b_objectProgram;

/**
 * 电脑类
 */
public class Computer {
    private boolean sreenShow = true;

    public Computer() {
        
    }

    public void computerRunning() {
        if (sreenShow) {
            System.out.println("电脑正在运行");
        }else {
            System.out.println("电脑故障");
        }
    }

    public void setSreenShow(boolean sreenShow) {
        this.sreenShow = sreenShow;
    }

    public boolean isSreenShow() {
        return sreenShow;
    }
    
}
