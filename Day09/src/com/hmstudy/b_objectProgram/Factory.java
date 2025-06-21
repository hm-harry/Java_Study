package com.hmstudy.b_objectProgram;
/**
 * 工厂类
 */
public class Factory {
    private String name;
    private String address;
    private String tele;

    public Factory() {
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTele() {
        return tele;
    }
    
    /**
     * 修理电脑
     * 
     * @param computer 电脑对象
     * @throws InterruptedException 
     */
    public void repair(Computer computer) throws InterruptedException {
        if (!computer.isSreenShow()) {
            System.out.println("电脑屏幕坏了，正在修理");
            Thread.sleep(500);

            computer.setSreenShow(true);
            System.out.println("电脑屏幕修理好了");
        } else {
            System.out.println("电脑屏幕正常，无需修理");
        }
    }

}
