package com.bootcoding.oops.numbers.service;

import com.bootcoding.oops.numbers.model.Number;

import java.util.Random;

public class NumberService {
    // to get random number
    public Number getRandomNumber(){
        Random random = new Random();
        int n = random.nextInt();
//        Number number = new Number();
        Number number = new Number();
        number.setNum(n);
        return number;
    }
}
