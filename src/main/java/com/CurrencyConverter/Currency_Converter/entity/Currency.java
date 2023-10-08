package com.CurrencyConverter.Currency_Converter.entity;

public abstract class Currency {

    public String type ;

    Currency(String type){
        this.type = type ;
    }

    public abstract double convert(String currencyType , double value );

}
