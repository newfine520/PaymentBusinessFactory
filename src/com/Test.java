package com;

public class Test {
    public  static  void main(String[] args)
    {
        IPaymentFactory factory=new ChinesePayFactory();
        factory.createSweepCode().Scan();
        factory.createWap().Input();


    }
}
