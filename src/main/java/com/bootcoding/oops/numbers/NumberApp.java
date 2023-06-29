package com.bootcoding.oops.numbers;

import com.bootcoding.oops.numbers.model.Number;
import com.bootcoding.oops.numbers.service.EvenOddService;
import com.bootcoding.oops.numbers.service.NumberService;
import com.bootcoding.oops.numbers.service.PalindromeService;
import com.bootcoding.oops.numbers.service.PrimeNumberService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class NumberApp {
    public static void main(String[] args) throws Exception{
        NumberService ns = new NumberService();
        EvenOddService eos = new EvenOddService();
        PalindromeService ps = new PalindromeService();
        PrimeNumberService pns = new PrimeNumberService();
        BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\numbers.csv"));

        ArrayList<Number> numbers = new ArrayList<>();
        for(int i = 0; i < 1000; i++){

            Number randomNumber = ns.getRandomNumber();
            eos.evenOdd(randomNumber);
            ps.palindrome(randomNumber);
            pns.primeNumber(randomNumber);
            numbers.add(randomNumber);

        }

        for(Number number : numbers) {
            writer.write(number.toString());
            writer.write("\n");
        }
        writer.flush();
        writer.close();
    }
}


