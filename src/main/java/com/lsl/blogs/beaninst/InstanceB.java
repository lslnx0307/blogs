package com.lsl.blogs.beaninst;

public class InstanceB {

    private InstanceA instanceA;

    public InstanceA getInstanceA() {
        return instanceA;
    }

    public void setInstanceA(InstanceA instanceA) {
        this.instanceA = instanceA;
    }

    public InstanceB() {
        System.out.println("InstanceB 初始化。。。");
    }

    public InstanceB(InstanceA instanceA) {
        this.instanceA = instanceA;
        System.out.println("InstanceB 有参初始化。。。");
    }
}
