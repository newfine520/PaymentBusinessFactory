package com;

public  class ChinesePayFactory extends  IPaymentFactory {
      protected  ISweepCode createSweepCode()
    {
        return new ChinesePaySweepCode();

    }
    protected  IWap createWap()
    {

        return new ChinesePayWap();
    }
}
