package com.CurrencyConverter.Currency_Converter.entity;

import org.springframework.stereotype.Component;

@Component

public class LE extends Currency{

    double toUSD  = 1/30.66;
    double toINR = 83.12;


    public LE() {
        super("LE");
    }

    @Override
    public double convert(String  currencyType, double value) {
        if ("INR".equals(currencyType) ) {
            return value * toINR;
        }       else if ("USD".equals(currencyType) ) {
            return value * toUSD;
        }
        else if("LE".equals(currencyType) )
            return value ;
        return 0 ;
    }
}
