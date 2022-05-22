package org.ip.demo;

public class CalculatorPositive extends Calculator {

    @Override
    public int minus(int x, int y) {
        int res = x - y;
        if (res < 0) {
            return -res;
        }
        else return res;
    }

}
