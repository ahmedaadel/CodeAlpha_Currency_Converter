package com.CurrencyConverter.Currency_Converter.entity;


import org.springframework.stereotype.Component;

@Component

public class USD extends Currency {
    double toINR =  83.12;
    double toLE =  30.66;
    public USD( ) {
        super("USD");
    }

    @Override
    public double convert(String currencyType , double value ) {
       if ("INR".equals(currencyType) ) {
           return value * toINR;
       }
       else if ("LE".equals(currencyType) ) {
           return value * toLE;
       }
       else if("USD".equals(currencyType) )
           return value ;
       return 0 ;
    }

}
