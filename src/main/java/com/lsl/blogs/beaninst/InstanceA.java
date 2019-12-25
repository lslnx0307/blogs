package com.lsl.blogs.beaninst;

public class InstanceA {

    private InstanceB instanceB;

    public InstanceB getInstanceB() {
        return instanceB;
    }

    public void setInstanceB(InstanceB instanceB) {
        this.instanceB = instanceB;
    }

    public InstanceA() {
        System.out.println("InstanceA 初始化。。。");
    }

    public InstanceA(InstanceB instanceB) {
        this.instanceB = instanceB;
        System.out.println("InstanceA 初始化。。。");
    }
}
