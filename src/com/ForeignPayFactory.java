package com;

public class ForeignPayFactory extends IPaymentFactory {
    protected  ISweepCode createSweepCode()
    {
        return new ForeignPaySweepCode();

    }
    protected  IWap createWap()
    {

        return new ForeignPayWap();
    }
}
