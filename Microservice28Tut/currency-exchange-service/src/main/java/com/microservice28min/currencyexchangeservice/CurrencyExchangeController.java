package com.microservice28min.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class CurrencyExchangeController{

    @Autowired
    private Environment environment;

    @Autowired
    private ExchangeValueRepository exchangeValueRepository;


//    @GetMapping("currency-exchange-service/from/{from}/to/{to}")
//    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to){
//
////        ExchangeValue exchangeValue = exchangeValueRepository.findByFromAndTo(from,to);
////        System.out.print(exchangeValue.toString());
//
//
//
////        ExchangeValue exchangeValue =
////                new ExchangeValue(1000L, from,to,BigDecimal.valueOf(65));
//
////        List<ExchangeValue> exchangeValue = exchangeValueRepository.findAllByFromAndTo(from,to);
////        System.out.print(exchangeValue.toString());
//
//
//        ExchangeValue exchangeValue1 = exchangeValue.get(0);
//        exchangeValue1.setPort(
//                Integer.parseInt(environment.getProperty("local.server.port")));
//        return exchangeValue1;
//
//    }

}
