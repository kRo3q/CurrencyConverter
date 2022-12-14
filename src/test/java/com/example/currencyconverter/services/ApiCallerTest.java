package com.example.currencyconverter.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApiCallerTest {

    @Test
    void getExchangeRate() {
        double rate = ApiCaller.getExchangeRate("2016-04-04");
        assertEquals(3.7675, rate);
    }
}