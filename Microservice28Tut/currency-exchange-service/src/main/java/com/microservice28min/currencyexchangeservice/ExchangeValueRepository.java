package com.microservice28min.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Long> {

    List<ExchangeValue> findAllByFromAndTo(String from, String to);

}
