package com.level42sw.calculator;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
    int sum(int a, int b) {
        return a+b;
    }

    int sub(int a, int b) {
        return a-b;
    }

    int mult(int a, int b) {
        return a*b;
    }
}
