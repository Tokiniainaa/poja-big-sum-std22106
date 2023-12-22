package com.poja.poja_big_sum_std22106.endpoint.rest.controller.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class BigSumController {
    @GetMapping("/big-sum")
    public String bigSum(@RequestParam("a") String a, @RequestParam("b") String b) {
        BigInteger bigInteger = new BigInteger(a);
        BigInteger bigInteger1 = new BigInteger(b);
        BigInteger result = bigInteger.add(bigInteger1);
        return result.toString();
    }
}
