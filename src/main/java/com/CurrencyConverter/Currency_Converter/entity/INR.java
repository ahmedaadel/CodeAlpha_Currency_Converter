package com.CurrencyConverter.Currency_Converter.entity;

import org.springframework.stereotype.Component;

@Component
public class INR extends Currency {

    double toUSD = 0.01 ;
    double toLE  =  0.37 ;


    public INR() {
        super("INR");
    }

    @Override
    public double convert(String currencyType, double value) {
        if ("USD".equals(currencyType) ) {
            return value * toUSD;
        }       else if ("LE".equals(currencyType) ) {
            return value * toLE;
        }
        else if("INR".equals(currencyType) )
            return value ;
        return 0 ;
    }
}
