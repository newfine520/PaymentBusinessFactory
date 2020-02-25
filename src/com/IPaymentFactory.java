package com;

public abstract class IPaymentFactory {

    public  void init()
    {
        System.out.println("初始化基础数据！");
    }

    protected abstract ISweepCode createSweepCode();

    protected abstract IWap createWap();
}
