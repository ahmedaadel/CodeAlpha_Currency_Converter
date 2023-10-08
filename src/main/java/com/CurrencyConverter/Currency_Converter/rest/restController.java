package com.CurrencyConverter.Currency_Converter.rest;

import com.CurrencyConverter.Currency_Converter.entity.Currency;
import com.CurrencyConverter.Currency_Converter.entity.INR;
import com.CurrencyConverter.Currency_Converter.entity.LE;
import com.CurrencyConverter.Currency_Converter.entity.USD;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class restController {
    Currency currency;

    @GetMapping("/home")
    public String homePage() {
        return "homePage";
    }

    @PostMapping("/result")
    public String CalculatedPage(Model model, @RequestParam int amount,
                                 @RequestParam String from, @RequestParam String to) {

        if ("USD".equals(from))
            currency = new USD();

        else if ("INR".equals(from))
            currency = new INR();

        else if ("LE".equals(from))
            currency = new LE();


        double res = currency.convert(to, amount);
        System.out.println(res);

        model.addAttribute("convertedAmount", res);
        return "homePage";
    }
}
