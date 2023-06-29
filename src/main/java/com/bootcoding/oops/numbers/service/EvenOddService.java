package com.bootcoding.oops.numbers.service;

import com.bootcoding.oops.numbers.model.Number;

public class EvenOddService {

    public void evenOdd(Number number){
        if(number.getNum() % 2 == 0){
            number.setEven("EVEN");
        }else{
            number.setEven("ODD");
        }
    }
}

